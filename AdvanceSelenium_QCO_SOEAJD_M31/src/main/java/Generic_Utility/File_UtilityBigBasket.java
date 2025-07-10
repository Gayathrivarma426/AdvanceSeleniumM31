package Generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_UtilityBigBasket {
	
	public  String getTheValue(String key) throws Throwable
	{
		 FileInputStream fis = new FileInputStream("C:\\Users\\sures\\Downloads\\BigBasketCommondata.txt");
		 Properties pro = new Properties();
		 pro.load(fis);
		String value = pro.getProperty(key);
		 return value;
		
	}
	 

}
