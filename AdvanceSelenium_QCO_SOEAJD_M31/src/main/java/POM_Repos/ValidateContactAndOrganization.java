package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidateContactAndOrganization {
	
	public ValidateContactAndOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
    }
	
	/**
	 * This method using for validate the contact details in contact with organization
	 * @param driver
	 * @param Firstname
	 */
	public void Contactvalidation(WebDriver driver,String Firstname )
	{
	//Actual contact name(name that is saved
	 String actdata = driver.findElement(By.id("dtlview_First Name")).getText();
	
//	if(Firstname.equals(actdata))
//	{
//		System.out.println("Cotact name is created");
//	}
//	else
//	{
//		System.out.println("Contact name is not created");
//	}
	 Assert.assertEquals(actdata, Firstname, "Contact name is not created");
	 System.out.println("Cotact name is created");
	
	}
   
	/**
	 * This method using for validate the organization details in contact with organization
	 * @param driver
	 * @param Organizationname
	 */
	public void OrganizationValidation(WebDriver driver,String Organizationname)
	{
   String actOrgName = driver.findElement(By.xpath("//td[@id='mouseArea_Organization Name']")).getText();
   System.out.println(actOrgName);

//    if(actOrgName.contains(Organizationname))
//    {
//   	 System.out.println("organization name is created");
//    }
//    else {
//   	 System.out.println("organization name is not created");
//    }

      Assert.assertEquals(actOrgName, Organizationname, "organization name is not created");
      System.out.println("organization name is created");
	
	}
	
	
		
	
	
}
