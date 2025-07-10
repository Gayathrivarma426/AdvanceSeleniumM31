package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.File_utility;
import Generic_Utility.WebDriver_Utility;
import Generic_Utility.excel_Utility;
import POM_Repos.ContactData;
import POM_Repos.ContactLookUp;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;

public class DataProvider2 {
	
	@Test(dataProvider = "readContactData")
	
	public void createContact() throws Throwable
	{
		
		  File_utility file = new File_utility();
		  String BROWSER = file.getKeyAndValue("browser");
		 String URL = file.getKeyAndValue("url");
		String USERNAME = file.getKeyAndValue("username");
		 String PASSWORD = file.getKeyAndValue("password");
		 
		 WebDriver driver;
		 
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("Edge"))
		 {
			 driver=new EdgeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		
		 
		 driver.get(URL);
		 
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizeWindow(driver);
		wlib.waitElementsToLoad(driver);
		
		LoginPage login = new LoginPage(driver);
		login.loginApp(USERNAME, PASSWORD);
		
		 HomePage homepage = new HomePage(driver);
		    homepage.contactlink();
		    
		ContactLookUp lookup = new ContactLookUp(driver);
		lookup.ClickContactLookUp();
		
		
		//using Excel_Utility
	
		excel_Utility Xlib = new excel_Utility();
		String Firstname = Xlib.getValueFromExcel(0, 0, "Contact");
        String lastname = Xlib.getValueFromExcel(0, 1, "Contact");
   
        
      ContactData contactdata = new ContactData(driver);
      contactdata.firstName(Firstname);
      contactdata.lastName(lastname);
	
	//click on save button
      contactdata.clicksavebutton();
      
     
		 homepage.logOut();
		 
		 driver.quit();
		 
	}
	
	@DataProvider
	public Object[][] readContactData() throws Throwable
	{
		
	excel_Utility elib = new excel_Utility();
		
	Object[][] data = elib.readDataUsingDAtaProvider("Contact");
	return data;	
		
		
		
	}
	
	
}
