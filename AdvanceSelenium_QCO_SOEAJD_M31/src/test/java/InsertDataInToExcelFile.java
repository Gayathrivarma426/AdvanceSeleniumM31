import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataInToExcelFile {

	public static void main(String[] args) throws Throwable {
		//step 1 - path connection
		//FileInputStream fis = new File FileInputStream("./src/test/resources/exceldata7.xlsx");

		    //step 1  - Path connection
				FileInputStream  fis  = new FileInputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
				
				//step 2  - Keeps the workbook / excel file in read mode
				 Workbook book = WorkbookFactory.create(fis);
				 
				 //step 3   - navigates into mentioned sheetname
				 Sheet sheet = book.getSheet("Sheet1");
				 
				 //step 4 - navigate to mention row num
				  Row row = sheet.createRow(6);
				  
				  //step 5 - navigate to mentioned cellnum
				  Cell cell = row.createCell(4);
				  
				  cell.setCellValue("Qspiders");
				  
				  System.out.println("data is inserted in to excel file");
				  
				  FileOutputStream fos = new FileOutputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
				  book.write(fos);
				  book.close();
				  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
