package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ValidationForProduct {
	//Element initialization
	
	public ValidationForProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

  
  //business logic
   /**
    * This method used for validate the product data wheather product  is created or not
    * @param driver
    * @param ProductName
    */
 

public void validateProductData(WebDriver driver,String ProductName)
{
	//validation for product name
	 String actProductName = driver.findElement(By.id("dtlview_Product Name")).getText();
	 
	 
//	 if(actProductName.equals(ProductName))
//	 {
//		 System.out.println("Product is created");
//	 }
//	 else
//	 {
//		 System.out.println("Product is not created");
//	 }
	
	 SoftAssert soft = new SoftAssert();
	 soft.assertEquals(actProductName, ProductName,"Product is not created");
	 System.out.println("Product is created");
	 soft.assertAll();


}

}
