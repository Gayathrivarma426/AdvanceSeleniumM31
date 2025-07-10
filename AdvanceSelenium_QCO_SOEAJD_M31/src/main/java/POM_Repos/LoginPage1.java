package POM_Repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	
	private WebDriver driver;
	//locators
	private By userTextField = By.name("user_name");
	private By passwordTextField = By.name("user_password");
	private By loginbutton = By.id("submitButton");
	
	//constructor
	public LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//methods to interact with webelements
	public void enterUserName(String Username)
	{
		WebElement userinput = driver.findElement(userTextField);
		userinput.sendKeys(Username);
	}
    public void enterPassword(String Password1)
     {
	      WebElement Password = driver.findElement(passwordTextField);
	      Password.sendKeys(Password1);
     }
	
	public void clickOnLogin()
	{
		WebElement login = driver.findElement(loginbutton);
		login.click();
		
	}
	public void LoginToApp(String name, String password)
	{
		enterUserName(name);
		enterPassword(password);
		clickOnLogin();
	}
	
	
	
	
	
	
	
	
}
