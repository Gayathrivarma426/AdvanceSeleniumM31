package Campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.File_utility;
import Generic_Utility.WebDriver_Utility;
import Generic_Utility.excel_Utility;
import POM_Repos.CampLookUpImg;
import POM_Repos.CampaignData;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.validationForCampaign;


// @Listeners(Generic_Utility.ExtentReportImp.class)
//@Listeners(Generic_Utility.ListenerImp.class)
public class CampaignCreationTest extends BaseClass {

//	@Test(groups = "smokeTest")
	//@Test(retryAnalyzer = Generic_Utility.RetryAnalyserImp.class)
	
	@Test
	public  void  campaignCreationTest() throws Throwable {
		
//        Iam pulling the code -----pull1
		
		
//		 
		
		
		
		//using File_Utility
//		File_utility flib = new File_utility();
//		//String BROWSER = flib.getKeyAndValue("browser");
//		String URL = flib.getKeyAndValue("url");
//		String USERNAME = flib.getKeyAndValue("username");
//		String PASSWORD = flib.getKeyAndValue("password");

		
//		  WebDriver driver;
//		  
//			if(BROWSER.equalsIgnoreCase("chrome"))
//			{
//				driver = new ChromeDriver();
//			}
//			else if(BROWSER.equalsIgnoreCase("edge"))
//			{
//				driver = new EdgeDriver();
//			}
//			else if (BROWSER.equalsIgnoreCase("firefox"))
//			{
//				driver = new FirefoxDriver();
//			}
//			else 
//			{
//				driver = new ChromeDriver();
//			}
			
		
			//using the data stored in the properties file
//			driver.get(URL);
//
//		
//			 LoginPage login = new LoginPage(driver);
//			 login.loginApp(USERNAME, PASSWORD);
			 	
			
			
			//using Webdriver utility for maximize and wait
			
//			 WebDriver_Utility wlib = new WebDriver_Utility();
//			 wlib.maximizeWindow(driver);
//			 wlib.waitElementsToLoad(driver);
//			
	
			//using Repos(Home page)
			 HomePage homepage = new HomePage(driver);
			 homepage.campaignCreation();
			 
			 
			 //using POM-Repo (clicking on create campaign lookup)
			 CampLookUpImg createCamp = new CampLookUpImg(driver);
			 createCamp.CampLookup();
		     

		     
		     //using excel Utility
		     excel_Utility xlib = new excel_Utility();
		     String ExcelData = xlib.getValueFromExcel(0, 0, "Campaign");
		     System.out.println(ExcelData);
		
		   
		     
		      CampaignData campdata = new CampaignData(driver);
		      campdata.campName(ExcelData);
		 //click on save button
		      campdata.save();
		 
		//This is used for listener top   (Taking screen short)   
         //    Assert.fail("Asser fail");
		//validation
		      
		      validationForCampaign validate = new validationForCampaign(driver);
		      validate.validatedCampData(driver, ExcelData);
		 
		  //sign out
		  
		  //   homepage.logOut();


	}
     @Test
	public void m2()
	{
		System.out.println("m2 is another method");
	}
	
}
