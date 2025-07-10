package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowSwitching {
	
	
	public WindowSwitching(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement productLookUpinCamp;
	

	@FindBy(name = "search_text")
	private WebElement searchTextField;
	
	@FindBy(name="search")
	private WebElement searchbutton;
	
	//getter methods 
	public WebElement getProductLookUpinCamp() {
		return productLookUpinCamp;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	//business class
	/**
	 * click on product lookup present in campaign
	 */
	public void clickproductLookUpinCamp()
	{
		productLookUpinCamp.click();
	}
	
	/**
	 * Click on search text field and enter the search data
	 * @param productname
	 */
	public void searchTextField(String productname)
	{
		searchTextField.sendKeys(productname);
	}
	
	/**
	 * Click on save button
	 */
	public void clickSearchButton()
	{
		searchbutton.click();
	}
	
	/**
	 * Click on the serach data .ie product name
	 * @param driver
	 * @param ProductName1
	 */
	public void productNameInCamp(WebDriver driver,String ProductName1 )
	{
		driver.findElement(By.xpath("//a[text()='"+ProductName1+"']")).click();
	}
	
	
	
	
	
	
	

}
