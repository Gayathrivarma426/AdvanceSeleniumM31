import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchingDataFromPDF {

	public static void main(String[] args) throws Throwable {
		
	//navigating to pdf	
		File file = new File("C:\\Users\\sures\\OneDrive\\Desktop\\automation testing\\SeleniumMasterNotes_3.pdf");
		
	//loading pdf data into doc variable
		PDDocument doc = PDDocument.load(file);
		
	//get the number of pages	
	//	 int pages = doc.getNumberOfPages();
	//	 System.out.println(pages);
	
		
	//This statement use to get the enter data in the pdf
		 PDFTextStripper pdfdata = new PDFTextStripper();
	
	//	reading the entire pdf data 
	//	  String readData = pdfdata.getText(doc);
	//	System.out.println(readData);
		
		
	  pdfdata.setStartPage(3);
	  pdfdata.setEndPage(3);
	String pageData = pdfdata.getText(doc);
	System.out.println(pageData);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
