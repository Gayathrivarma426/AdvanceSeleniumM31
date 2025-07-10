package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampLookUpImg {
	
	//Element initialization
	
	public CampLookUpImg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Element declaration
	
	@FindBy(xpath = "//img[@alt='Create Campaign...']")
	private WebElement LookupForCamp;

	
	//getter methods
	
	public WebElement getLookupForCamp() {
		return LookupForCamp;
	}
	
	//Business logic
	/**
	 * Clicking on Campaign lookup img
	 */
	public void CampLookup()
	{
		LookupForCamp.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
