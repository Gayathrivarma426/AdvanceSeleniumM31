package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationForContact {
	public ValidationForContact(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * This method used for validate the contact name wheather contact is created or not
	 * @param driver
	 * @param Firstname1
	 */
	
	public void validationForcontact(WebDriver driver,String Firstname1)
	{
		 String actdata = driver.findElement(By.id("dtlview_First Name")).getText();
	     
//	     if(actdata.equals(Firstname1))
//	     {
//	    	 System.out.println("Contact is created");
//	     }
//	     else 
//	     {
//	    	 System.out.println("Contact is not created");
//	     }
		 Assert.assertEquals(actdata, Firstname1,"Contact is not created");
		 System.out.println("Contact is created");
	
	}

}
