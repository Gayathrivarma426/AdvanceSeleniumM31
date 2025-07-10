package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class validationForCampaign {
	
	//Element initialization
	
			public validationForCampaign(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
   
	      
	      //business logic
			/**
			 * This method used for validate the campaign name wheather campaign name is created or not
			 * @param driver
			 * @param expData
			 */
		   
		   public void validatedCampData(WebDriver driver,String expData)
		   {
			   String actData = driver.findElement(By.id("dtlview_Campaign Name")).getText();
				  System.out.println(actData);
				
				 // verification
//				  if(actData.equals(expData))
//				  {
//					  System.out.println("Campaign name is created");
//					  
//				  }
//				  else
//				  {
//					  System.out.println("Campaign name is not created");
//				  }
				  
				  Assert.assertEquals(expData, actData,"Campaign name is not created");
				  System.out.println("Campaign name is created");
			   
		   }
	
	/**
	 * This method used for validate the product  name wheather product name is created or not
	 * @param driver
	 * @param ProductName
	 */
        public void validateProdData(WebDriver driver,String ProductName)
        {
			//validation for product name
			String actProductname = driver.findElement(By.id("dtlview_Product")).getText();
//			if (actProductname.equals(ProductName))
//			{
//				System.out.println("Product is selected");
//			}
//			else 
//			{
//				System.out.println("Product is not selected");
//			}
			
			 Assert.assertEquals(actProductname, ProductName,"Product is not selected");
			  System.out.println("Product is selected");
	
        }
	
	
	
	
	
	
	
	
	

}
