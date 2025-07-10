package Generic_Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImp implements IRetryAnalyzer{
	
	int count =0;
	int retyLimit=3;
	
	public boolean retry(ITestResult result)
	{
		if(count <  retyLimit)
		{
			count++;
			return true;
		}
		return false;
	}
	
	
	

}
