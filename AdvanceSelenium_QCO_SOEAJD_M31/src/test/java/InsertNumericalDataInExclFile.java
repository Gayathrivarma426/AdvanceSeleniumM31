import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertNumericalDataInExclFile {

	public static void main(String[] args) throws Throwable {
		

	//  FileInputStream fis = new FileInputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
	  
	//   Workbook book = WorkbookFactory.create(fis);
		
	//	Sheet sheet = book.getSheet("Sheet1");
	//	 Row row = sheet.createRow(8);
	//	 Cell cell = row.createCell(2);
	//	 cell.setCellValue("9876934567");
	//	 System.out.println("data is inserted");
		
	//	 FileOutputStream fos = new FileOutputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
	//	  book.write(fos);
	//	  book.close();
		
		
		
		//==========================================================================================
		  
		  
	//	 Row row1 = sheet.getRow(8);
	//	Cell cell1 = row1.getCell(2);
	//	String data = cell1.getStringCellValue();
	//	System.out.println(data);
		
		  
		  
		  FileInputStream  fis  = new FileInputStream("C:\\Users\\sures\\Downloads\\Exceldata7.xlsx");
			
			
			 Workbook book = WorkbookFactory.create(fis);
			 
			 Sheet sheet = book.getSheet("Sheet1");
		
			  Row row = sheet.getRow(8);
			  
			  Cell cell = row.getCell(2);
			  
		
		DataFormatter format = new DataFormatter();
		String exceldata = format.formatCellValue(cell);
		 System.out.println(exceldata);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
