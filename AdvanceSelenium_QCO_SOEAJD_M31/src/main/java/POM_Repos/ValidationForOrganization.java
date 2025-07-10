package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationForOrganization {
	
	public ValidationForOrganization(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
    //business logic
	
	/**
	 * This method used for validate the organization  name wheather organization name is created or not
	 * @param driver
	 * @param expname
	 */
	public void validatingOrgName(WebDriver driver,String expname) {
		
		String ActualName = driver.findElement(By.id("dtlview_Organization Name")).getText();
		   
		   
//		    if (ActualName.equals(expname) )
//		    {
//		        System.out.println("Data matches correctly");
//		    } 
//		    else
//		    
//		    {
//		        System.out.println("Mismatch in data");
//		    }
		Assert.assertEquals(ActualName, expname,"Mismatch in data");
		System.out.println("Data matches correctly");
		
		
	}

	
	
	
}
