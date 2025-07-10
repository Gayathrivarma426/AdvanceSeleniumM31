package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInContactPage {

	public OrganizationInContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "search_txt")
	private WebElement searchbar;
	
	@FindBy(name = "search")
	private WebElement searchbutton;

	
	//getter methods
	
	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	//business logic
	/**
	 * This method contains search text field where we can search the organization name
	 * @param Organizationname
	 */
	public void searchField(String Organizationname)
	{
		searchbar.sendKeys(Organizationname);
	}
	/**
	 * this method contains search button
	 */
	public void Searchbutton()
	{
		searchbutton.click();
	}
	/**
	 * this method used to click on organization name which we search for
	 * @param driver
	 * @param Organizationname1
	 */
	public void clickOnOrgName(WebDriver driver,String Organizationname1)
	{
		driver.findElement(By.xpath("//a[text()='"+Organizationname1+"']")).click();
	}
	
	

	
}
