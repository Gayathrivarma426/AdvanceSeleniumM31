package CampaignAndProduct;

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
import POM_Repos.CampLookUpImg;
import POM_Repos.CampaignData;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.ProdLookUpImg;
import POM_Repos.ProductData;
import POM_Repos.WindowSwitching;
import POM_Repos.validationForCampaign;

public class CampaignAndProductTest extends BaseClass {

	@Test()
	public  void campaignAndProductTest() throws Throwable {
		//Login to vtiger application->mouseOverOn more Link->
		//click on campaigns->click on create campaign lookup image->Enter campaignName->
		//Click on Product plus img->Handle the PopUp->Product name should be added to campaign createpage->
		//click on save Btn->verify whether the campaign name is created in campaign Information page and Logout from the application.
			
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
//			

			
			
			//using Webdriver utility for maximize and wait
			
//			 WebDriver_Utility wlib = new WebDriver_Utility();
//			 wlib.maximizeWindow(driver);
//			 wlib.waitElementsToLoad(driver);
//			
//			
//			//using the data stored in the properties file
//			driver.get(URL);
//			
//			//using loginpage.java in POM_Repo
//			 LoginPage login = new LoginPage(driver);
//			 login.loginApp(USERNAME, PASSWORD);
//			 
			 
			
			
//			driver.findElement(By.linkText("Products")).click();
			 
		
		
		
		
		//Eng2 is pushing
			 
		
		
		
		//pushing something
		
		
		
			 //using home page (POM-Repo)
			 HomePage homepage = new HomePage(driver);
			 homepage.productname();
			 
			// driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
			 ProdLookUpImg lookup = new ProdLookUpImg(driver);
			   lookup.clickProdLookUpImg();
			

			 //Using java utility(random)
				java_utility jlib = new java_utility();
				int ranNum = jlib.getRandomNum();
				 
				
				
				//usingExcelFile
				
		    excel_Utility Xlib = new excel_Utility();
			String ProductName =  Xlib.getValueFromExcel(0, 0, "Product")+ranNum;			
				
			System.out.println(ProductName);
			
//			driver.findElement(By.name("productname")).sendKeys(ProductName);
//			driver.findElement(By.name("button")).click();
			
			ProductData data = new ProductData(driver);
			 data.productName(ProductName);
			 data.savebutton();
			    
//==============================================================================================================================
			
			//clicking on more (links)
			//driver.findElement(By.linkText("More")).click();
			
			//clicking on campaigns
		//	driver.findElement(By.linkText("Campaigns")).click();
			
			homepage.campaignCreation();
		
			//click on campaign creation
		    // driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
			 CampLookUpImg lookupForCamp = new CampLookUpImg(driver);
			 lookupForCamp.CampLookup();
		     
		     
		     //using ExcelUtility
		     
		     String ExcelData =  Xlib.getValueFromExcel(0, 0, "Campaign")+ranNum;
			
			     //excel sheet data is giving to the application
		     
		     
//			  driver.findElement(By.name("campaignname")).sendKeys(ExcelData);
			  
	
		      CampaignData Campdata = new CampaignData(driver);
		      Campdata.campName(ExcelData);
		      
		      
		      
		    //click on product + button  
		  //    driver.findElement(By.xpath("//img[@alt='Select']")).click();
		      
		      WindowSwitching winSwitch = new WindowSwitching(driver);
		      winSwitch.clickproductLookUpinCamp();
		      
		      
			 //using webdriver utility for window switching
		      WebDriver_Utility wlib = new WebDriver_Utility();
			  wlib.windowSwitching(driver, "Products&action");
			  
	  
		//after clicking on product + button	  
		//driver.findElement(By.name("search_text")).sendKeys(ProductName);
		//driver.findElement(By.name("search")).click();
			  winSwitch.searchTextField(ProductName);
			  winSwitch.clickSearchButton();
			   
		
		//dynamic xpath
	//	driver.findElement(By.xpath("//a[text()='"+ProductName+"']")).click();
		winSwitch.productNameInCamp(driver, ProductName);
		
	
		//using webdriver utility for window switching
		  wlib.windowSwitching(driver, "Campaigns&action");
		
		//click on save
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Campdata.save();
		
		//validation for product name
//		String actProductname = driver.findElement(By.id("dtlview_Product")).getText();
//		if (actProductname.equals(ProductName))
//		{
//			System.out.println("Product is selected");
//		}
//		else 
//		{
//			System.out.println("Product is not selected");
//		}
//		
		
		//validation for Campaign name
//		 String actCampName = driver.findElement(By.id("dtlview_Campaign Name")).getText();
//		 
//		 if (actCampName.equals(ExcelData))
//			{
//				System.out.println("Campaign name is created");
//			}
//			else 
//			{
//				System.out.println("Campaign name is not created");
//			}
//		
		validationForCampaign validate = new validationForCampaign(driver);
		Thread.sleep(3000);
		validate.validatedCampData(driver, ExcelData);
		validate.validateProdData(driver, ProductName);
		
	//	homepage.logOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
