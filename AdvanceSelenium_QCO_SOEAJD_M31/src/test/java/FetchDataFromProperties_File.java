import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchDataFromProperties_File {
	
	public static  void main(String[] args) throws Throwable
	{
		//WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\sures\\Downloads\\commandata.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		 String BROWSER = pro.getProperty("browser");
		  String URL = pro.getProperty("url");
		  String USERNAME = pro.getProperty("username");
		   String PASSWORD = pro.getProperty("password");
		 
		  WebDriver driver;
		  
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new ChromeDriver();
		}
		
	   driver.get(URL);
	   driver.findElement(By.id("email")).sendKeys(USERNAME);
	   
	   driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		 
		
	}

}
