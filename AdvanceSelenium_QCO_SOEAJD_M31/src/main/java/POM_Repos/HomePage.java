package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Element initialization 
	
	public HomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Element declaration
	
	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignlink;

	@FindBy(linkText = "Products")
	private WebElement product;
	
	@FindBy(linkText = "Contacts")
	private WebElement contact;
	
	
	@FindBy(linkText = "Organizations")
	private WebElement Organization;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement LogoutLogo;
	
	@FindBy(linkText = "Sign Out")
	private WebElement LogOut;
	
	
	
	
	
	//using getter method 
	
	public WebElement getLogout() {
		return LogOut;
	}

	public WebElement getOrganization() {
		return Organization;
	}

	public WebElement getProduct() {
		return product;
	}


	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignlink() {
		return campaignlink;
	}
	
	public WebElement getContact() {
		return contact;
	}
	
	
	/**
	 * Business libraries
	 * This method contains more link and Campaign link ,by clicking on this we can enter in to the create campaign page
	 */
	public void campaignCreation()
	{
		moreLink.click();
		campaignlink.click();
	}
	
	/**
	 * This method contains product link 
	 */
	public void productname()
	{
		product.click();
	}

	/**
	 * This method contains contact link
	 */
	public void contactlink()
	{
		contact.click();
	}
	/**
	 * This method contains organization link
	 */
	public void OrganizationLink()
	{
		Organization.click();
	}
	/**
	 * This method used for logout purpose
	 */
	public void logOut()
	{
		LogoutLogo.click();
		LogOut.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
