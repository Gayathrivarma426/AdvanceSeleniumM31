package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationLookUp {

	public OrganizationLookUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement OrgLookUpImg;

	
	//getter method
	public WebElement getOrgLookUpImg() {
		return OrgLookUpImg;
	}
	
	
	//business logic
	/**
	 * click on lookup symbol
	 */
	public void ClickOnOrgLookUp()
	{
		
		OrgLookUpImg.click();	
		
	}
	
	
	
	
	
	
	
	
	
	
}
