import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertLinksToExcelSheet {

	public static void main(String[] args) throws Throwable {
		
		
		 FileInputStream  fis  = new FileInputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
		 
		 Workbook book = WorkbookFactory.create(fis);
			
		Sheet sheet = book.getSheet("Sheet1");
   
	   WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		for(int i = 0; i<alllinks.size();i++)
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(alllinks.get(i).getAttribute("href"));
			
			
		}
	    
	   FileOutputStream fos = new FileOutputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
	    book.write(fos);
     	  book.close();    
	 //===========================================================================
     	  
     	  
			
     	  
     	   
     	    
   
     	   
		}
     
	    
	    
		
		
		

	}


