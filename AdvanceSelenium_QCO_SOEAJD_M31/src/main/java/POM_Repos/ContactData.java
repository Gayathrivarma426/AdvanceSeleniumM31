package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactData {
	public ContactData(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement FirstName;
	
	@FindBy(name = "lastname")
	private WebElement LastName;

	
	@FindBy(name = "button")
	private WebElement Savebutton;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement organizationSymbolInContact;
	
	//getter methods
	
	public WebElement getOrganizationSymbolInContact() {
		return organizationSymbolInContact;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}
	
	
	//business logic/library
	/**
	 * This method store the First name
	 * @param Firstname
	 */
	
	public void firstName(String Firstname)
	{
		FirstName.sendKeys(Firstname);
	}
	/**
	 * This method store the last name
	 * @param lastname
	 */
	public void lastName(String lastname)
	{
		LastName.sendKeys(lastname);
	}
	
	/**
	 * Click on savebutton
	 */
	public void clicksavebutton()
	{
		Savebutton.click();
	}
	
	//business logic for dropdown
	/**
	 * This method is used for drop down which contains the title of the personname
	 * @param driver
	 */
	
	public void dropdownForTitleFirstname(WebDriver driver)
	{
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select select = new Select(dropdown);
		select.selectByValue("Ms.");
	}
	/**
	 * Click on the organization symbol present in the contact details page
	 */
	public void OrganizationSymbolInContact()
	{
		organizationSymbolInContact.click();
	}
	
	
}
