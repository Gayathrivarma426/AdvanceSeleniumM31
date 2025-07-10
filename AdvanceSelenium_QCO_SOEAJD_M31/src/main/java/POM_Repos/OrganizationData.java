package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationData {
	
	public OrganizationData(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountname")
	private WebElement orgname;
	
	@FindBy(name = "phone")
	private WebElement orgphonenum;
	
	@FindBy(id = "email1")
	private WebElement orgEmail;
	
	@FindBy(name = "button")
	private WebElement Savebutton;

	

	//getter methods 

	public WebElement getSavebutton() {
		return Savebutton;
	}
	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getOrgphonenum() {
		return orgphonenum;
	}

	public WebElement getOrgEmail() {
		return orgEmail;
	}
	
	//business logic 
	/**
	 * This method contains organizationName
	 * @param orgName
	 */
	public void  organizationName(String orgName)
	{
		orgname.sendKeys(orgName);
	}
	/**
	 * This method contains organizationphonenumber
	 * @param orgPhone
	 */
	public void OrgPhoneNumber(String orgPhone)
	{
		orgphonenum.sendKeys(orgPhone);
	}
	
	/**
	 * This method contains organizationemail
	 * @param orgemail
	 */
	public void OrgEmail(String orgemail)
	{
		orgEmail.sendKeys(orgemail);
	}
	/**
	 * This method contains savebutton
	 */
	public void savebutton()
	{
		Savebutton.click();
	}
	
	
	

}
