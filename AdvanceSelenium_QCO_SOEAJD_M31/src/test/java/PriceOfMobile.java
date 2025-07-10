import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceOfMobile {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		 driver.findElement(By.name("q")).sendKeys("iphone");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 List<WebElement> listofprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		for (WebElement price : listofprice)
		{
			String actualP = price.getText();
			 String ExpectedP = actualP.replace("₹", "").replace(",", "");
			 
			int Price1 = Integer.parseInt(ExpectedP);
			 
			 if(Price1 > 70000)
			 {
				 System.out.println(Price1);
			 }
		 
			 
		}
		
			
		
			

	}

}
