package Generic_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_utility {
	
	/**
	 * This method is used to read data from properties file(External resource)
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getKeyAndValue(String key) throws Throwable
	{
		
       FileInputStream fes = new FileInputStream("C:\\Users\\sures\\Downloads\\DataForVtiger.Properties");
		
		Properties pro = new Properties();
		//loading the data
		pro.load(fes);
		
		  String value = pro.getProperty(key);
		  return value;
		
		
	}
	
	
	
	
	

}
