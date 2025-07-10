
package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POM_Repos.HomePage;
import POM_Repos.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void BS()
	{
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void BT()
	{
		System.out.println("Parallel Execution");
	}
	
//   This parameters annotation is used for cross browser execution
//	@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	
//	public void Bc(String BROWSER) throws Throwable
//	{
	
	public void Bc() throws Throwable
	{
//		
		
		File_utility flib = new File_utility();
		String BROWSER = flib.getKeyAndValue("browser");
	
		//reading key from cmd prompt
		//String BROWSER = System.getProperty("browser");
		  
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new ChromeDriver();
		}
	
		System.out.println("Open the browser");
		 sdriver = driver;
	}
	
	   
	
//	This parameters annotation is used for cross browser execution
//	@Parameters({"URL","USERNAME","PASSWORD"})
	
	@BeforeMethod (groups = {"smokeTest","regressionTest"})
//	public void BM(String URL ,String USERNAME,String PASSWORD) throws Throwable
//	{
	
	public void BM() throws Throwable
	{
		
		//using File_Utility
				File_utility flib = new File_utility();
				String BROWSER = flib.getKeyAndValue("browser");
			String URL = flib.getKeyAndValue("url");
				String USERNAME = flib.getKeyAndValue("username");
				String PASSWORD = flib.getKeyAndValue("password");
		
		
//		      String URL = System.getProperty("url");
//		      String USERNAME = System.getProperty("username");
//		     String PASSWORD = System.getProperty("password");

				//using the data stored in the properties file
				driver.get(URL);
				
				 LoginPage login = new LoginPage(driver);
				 login.loginApp(USERNAME, PASSWORD);
				
				//using Webdriver utility for maximize and wait
				
				 WebDriver_Utility wlib = new WebDriver_Utility();
				 wlib.maximizeWindow(driver);
				 wlib.waitElementsToLoad(driver);
				 System.out.println("Login to the application");

	}
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void AM() throws Throwable
	{
		 HomePage homepage = new HomePage(driver);
		 homepage.logOut();
		System.out.println("LogOut from the application");
	}
	
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void Ac()
	{
		System.out.println("close the Browser");
		driver.quit();
	}
	
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void At()
	{
		System.out.println("close Parallel execution");
	}
	
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void As()
	{
		System.out.println("Close Database");
	}

}
