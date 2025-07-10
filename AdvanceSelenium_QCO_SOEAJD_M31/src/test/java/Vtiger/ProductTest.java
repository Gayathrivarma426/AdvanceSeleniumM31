package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.File_utility;
import Generic_Utility.WebDriver_Utility;
import Generic_Utility.excel_Utility;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.ProdLookUpImg;
import POM_Repos.ProductData;
import POM_Repos.ValidationForProduct;

public class ProductTest extends BaseClass {

	@Test
	public  void productTest() throws Throwable {
		
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
//				File_utility flib = new File_utility();
//				String BROWSER = flib.getKeyAndValue("browser");
//				String URL = flib.getKeyAndValue("url");
//				String USERNAME = flib.getKeyAndValue("username");
//				String PASSWORD = flib.getKeyAndValue("password");
//				
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
////			 login.getUserTextField().sendKeys(USERNAME);
////			 login.getPasswordTextField().sendKeys(PASSWORD);
////			 login.getLoginButton().click();
//			 login.loginApp(USERNAME, PASSWORD);
//			 
//			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
//			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//			driver.findElement(By.id("submitButton")).click();
//			
			//driver.findElement(By.linkText("Products")).click();
			 HomePage homepage = new HomePage(driver);
			 homepage.productname();
			 
			//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
			//clicking on product lookup img
			 ProdLookUpImg lookup = new ProdLookUpImg(driver);
			 lookup.clickProdLookUpImg();
			
			
			 excel_Utility xlib = new excel_Utility();
			 String ProductName = xlib.getValueFromExcel(0, 0, "Product");
			
			System.out.println(ProductName);
			
			//Entering the product data
			//driver.findElement(By.name("productname")).sendKeys(ProductName);
			
			//click  on save button
			//driver.findElement(By.name("button")).click();
			
			ProductData prdData = new ProductData(driver);
			prdData.productName(ProductName);
			prdData.savebutton();
		
		//validation
//			 String actProductName = driver.findElement(By.id("dtlview_Product Name")).getText();
//			 
//			 
//			 if(actProductName.equals(ProductName))
//			 {
//				 System.out.println("Product is created");
//			 }
//			 else
//			 {
//				 System.out.println("Product is not created");
//			 }

		
			ValidationForProduct validate = new ValidationForProduct(driver);
			validate.validateProductData(driver, ProductName);
	}

}
