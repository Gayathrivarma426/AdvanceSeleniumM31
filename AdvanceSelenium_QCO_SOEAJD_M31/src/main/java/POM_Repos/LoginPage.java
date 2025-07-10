package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Element initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Element declaration
	@FindBy(name ="user_name" )
	private WebElement UserTextField;
	
	@FindBy(name = "user_password")
	private WebElement PasswordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement LoginButton;
	
	//getter methods

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	
	/**
	 * Business Logic/libraries
	 * This method storing the login details of application
	 * @param USERNAME
	 * @param PASSWORD
	 */
	public void loginApp(String USERNAME1,String PASSWORD1)
	{
		UserTextField.sendKeys(USERNAME1);
		PasswordTextField.sendKeys(PASSWORD1);
		LoginButton.click();
			
	}
	

}
