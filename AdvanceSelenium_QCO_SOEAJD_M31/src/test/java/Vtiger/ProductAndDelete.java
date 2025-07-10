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
import Generic_Utility.java_utility;
import POM_Repos.HomePage;
import POM_Repos.LoginPage;
import POM_Repos.ProdLookUpImg;
import POM_Repos.ProductData;
import POM_Repos.ValidationForProductAndDelete;

public class ProductAndDelete extends BaseClass {
	public void productAndDeleteTest() throws Throwable {
		
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
//		
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
			//driver.findElement(By.linkText("Products")).click();
			 
			HomePage homepage = new HomePage(driver);
			homepage.productname();
			
			//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
			 ProdLookUpImg lookup = new ProdLookUpImg(driver);
			 lookup.clickProdLookUpImg();
			
//			Random ran = new Random();
//			int rannum = ran.nextInt(1000);
			
			//Using java utility(random)
			java_utility jlib = new java_utility();
			int ranNum = jlib.getRandomNum();
			
			
//			FileInputStream fes1 = new FileInputStream("C:\\Users\\sures\\Downloads\\VtigerData.xlsx");
//		     
//		    Workbook book = WorkbookFactory.create(fes1);
//		
//		     Sheet sheet = book.getSheet("Product");
//		     
//		     String ProductName = sheet.getRow(0).getCell(0).getStringCellValue()+ranNum;
			
			
			 excel_Utility xlib = new excel_Utility();
			 String ProductName = xlib.getValueFromExcel(0, 0, "Product")+ranNum;
			
			System.out.println(ProductName);
			
//			 driver.findElement(By.name("productname")).sendKeys(ProductName);
//			driver.findElement(By.name("button")).click();
			 ProductData data = new ProductData(driver);
			 data.productName(ProductName);
			 data.savebutton();
		
		//=================================================
			//navigate to product link again
			
			homepage.productname();
			//driver.findElement(By.linkText("Products")).click();
			
//			//click on check box which we want to delete
//			driver.findElement(By.xpath("//table[@class='lvtBg']//a[text()='"+ProductName+"']/../preceding-sibling::td[2]//input[@type='checkbox']"))	.click();
//			
//			//delete the selected product
//			driver.findElement(By.xpath("//input[@value='Delete']")).click();
			
			//homepage.clickOnCheckBoxAndDelete(driver, ProductName);
			lookup.clickOnCheckBox(driver, ProductName);
			lookup.ClickOnDelete();
			
			//handle the popup
			 WebDriver_Utility popup = new WebDriver_Utility();
			 popup.alertHandle(driver);
			
		//	driver.switchTo().alert().accept();
			
			//listing all the product names
//			 List<WebElement> prdData = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));
//			 
//			boolean flag = false;
//			for (WebElement prd : prdData) 
//			{
//				String actprd = prd.getText();
//				if (actprd.equals(ProductName))
//				{
//					flag=true;
//					break;
//				}
//			}
//			
//			if (flag) 
//			{
//				
//				System.out.println("Product name is deleted");
//			}
//			else
//			{
//				System.out.println("product name is not deleted");
//			}
			
			
			//validation
			 
			ValidationForProductAndDelete validate = new ValidationForProductAndDelete(driver);
			validate.validationOfProdDelete(driver, ProductName);
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
