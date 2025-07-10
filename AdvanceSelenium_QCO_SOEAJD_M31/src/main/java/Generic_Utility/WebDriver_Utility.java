package Generic_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	
	/**
	 * This method used for maximizing the window
	 * @param driver
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	/**
	 * This method used for Wait command
	 * @param driver
	 */
	public void waitElementsToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
			
	}
	
	/**
	 * This method is used to switch the window
	 * @param driver
	 * @param partialTitle
	 */
	
	public void windowSwitching(WebDriver driver,String partialTitle)
	{
		
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> it = allwin.iterator();
		while(it.hasNext()) 
		{
			String win = it.next();
			driver.switchTo().window(win);
			@Nullable
			String title = driver.getTitle();
			
			if(title.contains(partialTitle))
			{
				break;
			}
			
		}
		
	}
	
	
	/**
	 * This method used for drop down
	 * @param ele
	 * @param data
	 */
	public void dropDown(WebElement ele,String data)
	{
		Select select = new Select(ele);
		select.selectByValue(data);
	}
	
	
	/**
	 * This method used for Handling the alert (pop up)
	 * @param driver
	 */
	public void alertHandle(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	
	public static String takeScreenshortEx(WebDriver driver , String screenShortName) throws Throwable
	{
		
		 TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShorts/"+screenShortName+".png");
		FileUtils.copyFile(src, des);
		return des.getAbsolutePath();
		
		
	}
	
	
}
