package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repos.LoginPage2;

//class name Sample Test
public class Sample {

	public static void main(String[] args) throws Throwable {
		
		
		 
			 
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
//			 LoginPage1 login = new LoginPage1(driver);
//			 login.enterUserName("admin");
//			 login.enterPassword("admin");
//			 login.clickOnLogin();
			 driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
			 Thread.sleep(3000);
//			 LoginPage1 login = new LoginPage1(driver);
//			 login.LoginToApp("admin", "admin");

			LoginPage2 login2 = new LoginPage2(driver);
			login2.loginToVtiger("admin", "admin");
			 
			 
		
		
	
		
		
		
		

	}

}
