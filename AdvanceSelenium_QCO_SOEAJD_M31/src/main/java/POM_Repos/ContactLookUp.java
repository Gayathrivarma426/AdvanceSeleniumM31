package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactLookUp {

	
	public ContactLookUp(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement ContactLookUp;

	//getter methods 
	public WebElement getContactLookUp() {
		return ContactLookUp;
	}
	
	//business logic
	/**
	 * Clicking on the contact lookup img
	 */
	public void ClickContactLookUp()
	{
		ContactLookUp.click();
	}
	
	
}
