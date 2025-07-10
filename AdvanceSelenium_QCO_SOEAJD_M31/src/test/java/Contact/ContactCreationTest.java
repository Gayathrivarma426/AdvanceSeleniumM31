package Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import POM_Repos.ContactData;
import POM_Repos.ContactLookUp;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.ValidationForContact;

//@Listeners(Generic_Utility.ExtentReportImp.class)
//@Listeners(Generic_Utility.ListenerImp.class)
public class ContactCreationTest extends BaseClass{

	
	//@Test(groups = "regressionTest")
	@Test()
	public  void contactCreationTest() throws Throwable {
		
		
//FileInputStream fes = new FileInputStream("C:\\Users\\sures\\Downloads\\DataForVtiger.Properties");
//		
//		Properties pro = new Properties();
//		//loading the data
//		pro.load(fes);
//		
//		 String BROWSER = pro.getProperty("browser");
//		 
//		String URL = pro.getProperty("url");
//		String USERNAME = pro.getProperty("username");   
//		String PASSWORD = pro.getProperty("password");
		
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
			
			//using Webdriver utility for maximize and wait
			
//			 WebDriver_Utility wlib = new WebDriver_Utility();
//			 wlib.maximizeWindow(driver);
//			 wlib.waitElementsToLoad(driver);
//			
//			
//			
//			
//			//using the data stored in the properties file
//			driver.get(URL);
//			//using loginpage.java in POM_Repo
//			 LoginPage login = new LoginPage(driver);
//			 login.loginApp(USERNAME, PASSWORD);
////			 
			
		
		     //click on contact link
		//	driver.findElement(By.linkText("Contacts")).click();
		    HomePage homepage = new HomePage(driver);
		    homepage.contactlink();
		    
			//click on contact creation(+)
			//driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		   ContactLookUp lookup = new ContactLookUp(driver);
		   lookup.ClickContactLookUp();
			
			//dropdown
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@name='salutationtype']"));
			
			//dropdown from webdriver utility
			 WebDriver_Utility dd = new WebDriver_Utility();
			dd.dropDown(dropdown,"Ms.");
			
			//Exceldata
			
//			FileInputStream fes1 = new FileInputStream("C:\\Users\\sures\\Downloads\\VtigerData.xlsx");
//		     
//		    Workbook book = WorkbookFactory.create(fes1);
//		
//		     Sheet sheet = book.getSheet("Contact");
//		     
//		     //Reading the data from excel
//		     String Firstname = sheet.getRow(0).getCell(0).getStringCellValue();
//		     
//		     //inserting data in to application
//		     driver.findElement(By.name("firstname")).sendKeys(Firstname);
//		     
//		     
//		   String lastname = sheet.getRow(0).getCell(1).getStringCellValue();
//		   driver.findElement(By.name("lastname")).sendKeys(lastname);
			
			
			//using Excel_Utility
		
			excel_Utility Xlib = new excel_Utility();
			String Firstname = Xlib.getValueFromExcel(0, 0, "Contact");
		//	driver.findElement(By.name("firstname")).sendKeys(Firstname);
	        String lastname = Xlib.getValueFromExcel(0, 1, "Contact");
	     //   driver.findElement(By.name("lastname")).sendKeys(lastname);
	        
	      ContactData contactdata = new ContactData(driver);
	      contactdata.firstName(Firstname);
	      contactdata.lastName(lastname);
		
		//click on save button
		   //driver.findElement(By.name("button")).click();
	      contactdata.clicksavebutton();
		
		//validation
//		     String actdata = driver.findElement(By.id("dtlview_First Name")).getText();
//		     
//		     if(actdata.equals(Firstname))
//		     {
//		    	 System.out.println("Contact is created");
//		     }
//		     else 
//		     {
//		    	 System.out.println("Contact is not created");
//		     }
//	      Assert.fail("Assert is failed");
//		
		 ValidationForContact validate = new ValidationForContact(driver);
		 validate.validationForcontact(driver, Firstname);
		

	}
	
	//created the method for Regional Regression testing
	//@Test
//	public void m1()
//	{
//		System.out.println("Regional Regression Test");
//	}

}
