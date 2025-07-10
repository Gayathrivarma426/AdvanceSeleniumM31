

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebuggingForTestScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Methods data = new Methods();
		data.maximizeWindow(driver);
		data. wait(driver);
		driver.findElement(By.name("q")).sendKeys("puma");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
