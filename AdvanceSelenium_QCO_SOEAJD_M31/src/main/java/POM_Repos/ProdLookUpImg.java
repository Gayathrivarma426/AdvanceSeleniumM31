package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdLookUpImg {
	
	//Element intilaization
	
	public ProdLookUpImg(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
			
	}
	
	//Element declaration
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement ProductlooupImg;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement Deletebutton;

	//getter methods

	public WebElement getDeletebutton() {
		return Deletebutton;
	}


	public WebElement getCampAndProductlooup() {
		return ProductlooupImg;
	}
	
	
	public void clickProdLookUpImg()
	{
		
		ProductlooupImg.click();
	}
	
	
	//business logic for product and delete (click on check box and delete it)
	/**
	 * clicking on check box
	 * @param driver
	 * @param ProductName
	 */
	
		public void clickOnCheckBox(WebDriver driver,String ProductName )
		{
			driver.findElement(By.xpath("//table[@class='lvtBg']//a[text()='"+ProductName+"']/../preceding-sibling::td[2]//input[@type='checkbox']")).click();
			
		}
		/**
		 * click on delete button
		 */
		public void ClickOnDelete()
		{
			Deletebutton.click();
		}
		
	

}
