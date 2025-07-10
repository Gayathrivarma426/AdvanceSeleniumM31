package Contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.File_utility;
import Generic_Utility.WebDriver_Utility;
import Generic_Utility.excel_Utility;
import Generic_Utility.java_utility;
import POM_Repos.ContactData;
import POM_Repos.ContactLookUp;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.OrganizationData;
import POM_Repos.OrganizationInContactPage;
import POM_Repos.OrganizationLookUp;
import POM_Repos.ValidateContactAndOrganization;

public class ContactWithOrganizationTest  extends BaseClass{

	@Test
	public  void contactWithOrganizationTest() throws Throwable {

		//using File_Utility
//		
//		File_utility flib = new File_utility();
//	//	String BROWSER = flib.getKeyAndValue("browser");
//		String URL = flib.getKeyAndValue("url");
//		String USERNAME = flib.getKeyAndValue("username");
//		String PASSWORD = flib.getKeyAndValue("password");
		
		
//		  WebDriver driver;
		  
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

			//using webdriver utility for wait commands
			
//			 WebDriver_Utility wlib = new WebDriver_Utility();
//			 wlib.maximizeWindow(driver);
//			 wlib.waitElementsToLoad(driver);
//			
//			
//			
//			//using the data stored in the properties file
//			driver.get(URL);
//			
//			
//			//using loginpage.java in POM_Repo
//			 LoginPage login = new LoginPage(driver);
//			 login.loginApp(USERNAME, PASSWORD);
			 
			
			
			//==========================================
	//===================================create organization======================================================
			
			//click on organization
			// driver.findElement(By.linkText("Organizations")).click();
			 
			 //using POM-Repos
			 HomePage homepage = new HomePage(driver);
			 homepage.OrganizationLink();
			 
			 //click on create button
			// driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			 OrganizationLookUp lookup = new OrganizationLookUp(driver);
			 lookup.ClickOnOrgLookUp();
			 
			 
			 //Using java utility(random)
			java_utility jlib = new java_utility();
			int ranNum = jlib.getRandomNum();
			
			
			//using Excel data
			
			 excel_Utility xlib = new excel_Utility();
			String Organizationname = xlib.getValueFromExcel(0, 0, "Organization")+ranNum;
			System.out.println(Organizationname);
			String phonenumber = xlib.getExcelDataUsingFormatter(1, 0, "Organization");
			String Email = xlib.getExcelDataUsingFormatter(2, 0, "Organization");
			

					
			 Thread.sleep(2000);
//			 driver.findElement(By.name("accountname")).sendKeys(Organizationname);
//		     driver.findElement(By.name("phone")).sendKeys(phonenumber);
//	         driver.findElement(By.id("email1")).sendKeys(Email); 
			 
			OrganizationData OrgData = new OrganizationData(driver);
			OrgData.organizationName(Organizationname);
			OrgData.OrgPhoneNumber(phonenumber);
			OrgData.OrgEmail(Email);
			
			 //click on save button
			OrgData.savebutton();
				    
		     //click on save button
				     
		    // driver.findElement(By.name("button")).click();
				     
	//=======================================organization created==================================================================				
	//===============================================contact creation=============================================================
				    
				    Thread.sleep(2000);
				    
		     //click on contact link
			//driver.findElement(By.linkText("Contacts")).click();
				    
				//using Home page POM-Repo
				    
				  homepage.contactlink()  ;
				    
			
			//click on contact creation(+)
			//driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
				 ContactLookUp lookUp = new ContactLookUp(driver);
				 lookUp.ClickContactLookUp();
			
			//dropdown
			
//			WebElement dropdown = driver.findElement(By.xpath("//select[@name='salutationtype']"));
//			Select select = new Select(dropdown);
//			select.selectByValue("Ms.");
			
				ContactData contactdata = new ContactData(driver);
				contactdata.dropdownForTitleFirstname(driver);
				
			
		
		   //using excel data from excel utility
		   
		   String Firstname = xlib.getValueFromExcel(0, 0, "Contact");
		   String lastname = xlib.getValueFromExcel(0, 1, "Contact");
		   
		   //inserting data in to application
//		     driver.findElement(By.name("firstname")).sendKeys(Firstname);
//		     driver.findElement(By.name("lastname")).sendKeys(lastname);
		   
		   contactdata.firstName(Firstname);
		   contactdata.lastName(lastname);
		   
		   
		   //click on organization (+) symbol
		  // driver.findElement(By.xpath("//img[@title='Select']")).click();
		   contactdata.OrganizationSymbolInContact();
		  
		  //iterator 
		   WebDriver_Utility wlib = new WebDriver_Utility();
		   wlib.windowSwitching(driver,"Accounts&action" );
		  
		   
			
		//click on search text field
		//	driver.findElement(By.id("search_txt")).sendKeys(Organizationname);
			
			//click on search button
		//	driver.findElement(By.name("search")).click();
			
		//click on organization name
		//	driver.findElement(By.xpath("//a[text()='"+Organizationname+"']")).click();
		
		  OrganizationInContactPage OrgPluseSymbol = new OrganizationInContactPage(driver);
		  OrgPluseSymbol.searchField(Organizationname);
		  OrgPluseSymbol.Searchbutton();
		  OrgPluseSymbol.clickOnOrgName(driver, Organizationname);
		   
			
			//switch back to the parent window
			wlib.windowSwitching(driver, "Contacts&action");
		
			
			Thread.sleep(3000);
			//click on save button
			//   driver.findElement(By.name("button")).click();
			   OrgData.savebutton();
			
//			//Actual contact name(name that is saved
//			 String actdata = driver.findElement(By.id("dtlview_First Name")).getText();
//			
//			if(Firstname.equals(actdata))
//			{
//				System.out.println("Cotact name is created");
//			}
//			else
//			{
//				System.out.println("Contact name is not created");
//			}
//		
//		    
//		    String actOrgName = driver.findElement(By.xpath("//td[@id='mouseArea_Organization Name']")).getText();
//		    System.out.println(actOrgName);
//		
//		     if(actOrgName.contains(Organizationname))
//		     {
//		    	 System.out.println("organization name is created");
//		     }
//		     else {
//		    	 System.out.println("organization name is not created");
//		     }
//		
		//valiadation
			   
			    ValidateContactAndOrganization validate = new ValidateContactAndOrganization(driver);
			    validate.Contactvalidation(driver, Firstname);
			   // validate.OrganizationValidation(driver, Organizationname);
		
		

	}

}
