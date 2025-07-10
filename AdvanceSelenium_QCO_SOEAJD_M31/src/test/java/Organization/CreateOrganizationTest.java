package Organization;

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
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.OrganizationData;
import POM_Repos.OrganizationLookUp;
import POM_Repos.ValidationForOrganization;

public class CreateOrganizationTest extends BaseClass {

	//@Test(groups = {"smokeTest,regressionTest"})
	@Test
	public  void createOrganizationTest() throws Throwable {
		
		//Login to vtiger application->click on organizations link->click on create organization lookup image->
		//Enter organisation name,phone number and email->
		//click on save Btn->
		//verify whether the organization is created in Organization Information page and Logout from the application. 
		
		
//      FileInputStream fes = new FileInputStream("C:\\Users\\sures\\Downloads\\DataForVtiger.Properties");
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
		
		//using File_utility
//		File_utility flib = new File_utility();
//		String BROWSER = flib.getKeyAndValue("browser");
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
//			
//			//using Webdriver utility for maximize and wait
//			
//			 WebDriver_Utility wlib = new WebDriver_Utility();
//			 wlib.maximizeWindow(driver);
//			 wlib.waitElementsToLoad(driver);
//			
//			
//			
//			
//			//using the data stored in the properties file
//			driver.get(URL);
//			
//			//using loginpage.java in POM_Repo
//			 LoginPage login = new LoginPage(driver);
//			 login.loginApp(USERNAME, PASSWORD);
			 
//			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
//			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//			driver.findElement(By.id("submitButton")).click();
			
		//click on organization
			// driver.findElement(By.linkText("Organizations")).click();
			 HomePage homepage = new HomePage(driver);
			 homepage.OrganizationLink();
			 
			 //click on Organization create button
			// driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			OrganizationLookUp orglookup = new OrganizationLookUp(driver);
			orglookup.ClickOnOrgLookUp();
			 
			 
			 //Using java utility(random)
			java_utility jlib = new java_utility();
			int ranNum = jlib.getRandomNum();
			 
			
			//using Excel data
			
			 excel_Utility xlib = new excel_Utility();
			String name = xlib.getValueFromExcel(0, 0, "Organization")+ranNum;
			String phonenumber = xlib.getExcelDataUsingFormatter(1, 0, "Organization");
			String Email = xlib.getExcelDataUsingFormatter(2, 0, "Organization");
			 
		
//			 FileInputStream fes1 = new FileInputStream("C:\\Users\\sures\\Downloads\\VtigerData.xlsx");
//		     
//			    Workbook book = WorkbookFactory.create(fes1);
//			
//			     Sheet sheet = book.getSheet("Organization");
//			     
//			     String name = sheet.getRow(0).getCell(0).getStringCellValue()+ranNum;
//			   //------------------------------------------------------  
//			     Row row1 = sheet.getRow(1);
//					Cell cell1 = row1.getCell(0);
//					DataFormatter format = new DataFormatter();
//					String phonenumber = format.formatCellValue(cell1);
//					
//			 //---------------------------------------------------------
//
//					Row row2 = sheet.getRow(2);
//					Cell cell2 = row2.getCell(0);
//					DataFormatter format1 = new DataFormatter();
//					String Email = format1.formatCellValue(cell2);
					
			      
			
			
			      
			     Thread.sleep(2000);
			     
//			      driver.findElement(By.name("accountname")).sendKeys(name);
//			      driver.findElement(By.name("phone")).sendKeys(phonenumber);
//			      driver.findElement(By.id("email1")).sendKeys(Email); 
			     
			     OrganizationData Orgdata = new OrganizationData(driver);
			     Orgdata.organizationName(name);
			     Orgdata.OrgPhoneNumber(phonenumber);
			     Orgdata.OrgEmail(Email);
			    
			     //click on save button
			     
			  //   driver.findElement(By.name("button")).click();
			     Orgdata.savebutton();
			     
			  //Saved data   
			  //   String ActualName = driver.findElement(By.id("dtlview_Organization Name")).getText();
			   //  String ActualPhoneNo = driver.findElement(By.name("phone")).getText();
			 //   String ActualEmail = driver.findElement(By.id("email1")).getText();
//			   
//			    Thread.sleep(2000);
//			    if (ActualName.equals(name) )
//			    {
//			        System.out.println("Data matches correctly");
//			    } 
//			    else
//			    
//			    {
//			        System.out.println("Mismatch in data");
//			    }
			
			    ValidationForOrganization validate = new ValidationForOrganization(driver);
			    validate.validatingOrgName(driver, name);
		
			   //logout 
//			    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//				
//				driver.findElement(By.linkText("Sign Out")).click();
	//		    homepage.logOut();
		
		
		

	}
	
	
	//This method is created for Regional Regression Testing 
//	@Test
//	public void m2()
//	{
//		System.out.println("Regional Reggression");
//	}
	
	
	

	
	

}
