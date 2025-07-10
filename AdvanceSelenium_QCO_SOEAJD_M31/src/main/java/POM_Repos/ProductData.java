package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductData {
	
	
	//element initilization
	public ProductData(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);	
		
	}
	
	//Element declaration
	//data for product
	 @FindBy(name = "productname")
	 private WebElement productname;
	 
	 
	 @FindBy(name = "button")
	 private WebElement savebutton;

  
	 
	 
	 //getter method
	 
	

	public WebElement getProductname() {
		return productname;
	}


	public WebElement getSavebutton() {
		return savebutton;
	}
	 
	 //validation
	/**
	 * This method used for productname
	 * @param ProdName
	 */
	public void productName(String ProdName)
	{
		productname.sendKeys(ProdName);
		
	}
	/**
	 * this method used for save button
	 */
	public void savebutton() {
		savebutton.click();
	}
	
	
	
}
