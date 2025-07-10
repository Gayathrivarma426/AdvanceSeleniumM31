package Practice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Generic_Utility.File_UtilityBigBasket;

public class BigBasket {
	
	public static void main(String[] args) throws Throwable {
		
	
		 File_UtilityBigBasket fil = new File_UtilityBigBasket();
		 String BROWSER = fil.getTheValue("browser");
		 String URL = fil.getTheValue("url");
		 
		WebDriver driver ;
		 if(BROWSER.equalsIgnoreCase("chrome") )
		 {
			 driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("edge"))
		 {
			 driver=new EdgeDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		 System.out.println(BROWSER);
		 System.out.println(URL);
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");
		
		//click on search button
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("mango");
		
		//All the suggestions
	    List<WebElement> mangodata = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
		
	     for (WebElement onebyone : mangodata)
	      {
		    System.out.println(onebyone.getText());
	      }
	     
	    //click on view product 
	     driver.findElement(By.linkText("View all search results")).click();
		
	  //click on one of the mango product
	     driver.findElement(By.cssSelector("img[alt='fresho! Mango - Chausa 1 kg']")).click();
	     
	     
	     Thread.sleep(3000);
	     
	   //click on Add to basket
	 //    driver.findElement(By.xpath("(//button[text()='Add to basket'])[2]")).click();
	     
	    //Switch to alert
//	    Alert popup = driver.switchTo().alert();
//	    System.out.println(popup.getText());
//	     
	     
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
