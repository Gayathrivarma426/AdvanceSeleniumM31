package POM_Repos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignData {
	
	//Element initialization
	
		public CampaignData(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Element declaration
		@FindBy(name = "campaignname")
		private WebElement CampaignName;
		
		@FindBy(name = "button")
		private WebElement savebutton;

		
		
		//Getter Methods
		public WebElement getCampaignName() {
			return CampaignName;
		}
		
		public WebElement getSavebutton() {
			return savebutton;
		}
		
		
		
		
		//business logic /library
		/**
		 * This method storing the campaign name 
		 * @param ExcelData1
		 */
	    public void campName(String ExcelData1)
	    {
	    	CampaignName.sendKeys(ExcelData1);
	    }
        
	    /**
	     * This method used to save the entered data
	     */
	    public void save()
	    {
	    	savebutton.click();
	    }

		
		
		
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
