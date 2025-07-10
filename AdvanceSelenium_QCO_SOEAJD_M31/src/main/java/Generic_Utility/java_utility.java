package Generic_Utility;

import java.util.Random;

public class java_utility {
	
	/**
	 * This method is used to avoid the duplicate values
	 * @return
	 * @Gayathri
	 */
	public int getRandomNum()
	{
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}
	
	
	
	
	

}
