package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "user_name")
	private WebElement usertextField;
	
	@FindAll({@FindBy(name = "user_password"),@FindBy(css = "[type='password']")})
	private WebElement password;
	
	@FindBys({@FindBy(css = "[value='Login']"),@FindBy(id = "submitButton")})
	private WebElement loginbutton;
	
	public void loginToVtiger(String name,String password1)
	{
		
		usertextField.sendKeys(name);
		password.sendKeys(password1);
		
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
