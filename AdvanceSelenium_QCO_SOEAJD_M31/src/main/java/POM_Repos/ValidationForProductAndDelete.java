package POM_Repos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ValidationForProductAndDelete {
	
	
	public ValidationForProductAndDelete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//business logic
	/**
	 * 
	 * @paraThis method used for validate the created product is deleted or not
	 * @param ProductName
	 */
	
	public void validationOfProdDelete(WebDriver driver,String ProductName )
	{
		
		//listing all the product names
		 List<WebElement> prdData = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));
		 
		boolean flag = false;
		for (WebElement prd : prdData) 
		{
			String actprd = prd.getText();
			if (actprd.equals(ProductName))
			{
				flag=true;
				break;
			}
		}
		
		if (flag) 
		{
			
			System.out.println("Product name is deleted");
		}
		else
		{
			System.out.println("product name is not deleted");
		}
		
	}
	
	

}
