import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkartdata {

	public static void main(String[] args) {
		
      
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone15");
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		  List<WebElement> Mobiles = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']"));
		  List<WebElement> price = driver.findElements(By.xpath("//div[@class = 'Nx9bqj _4b5DiR']"));
		  
//		  System.out.println("Name of the mobiles");
//		 
//		for(WebElement allnames : Mobiles)
//		{
//	    	System.out.println(allnames.getText());
//		}
//		
//		 System.out.println("price of the mobiles");
//		
//		for(WebElement priceofMobiles : price)
//		{
//	    	System.out.println(priceofMobiles.getText());
//		}
		for (int i = 0; i < Mobiles.size(); i++) {
			System.out.println(Mobiles.get(i).getText() + "----------->" + price.get(i).getText());
		}
		
		
	}

}
