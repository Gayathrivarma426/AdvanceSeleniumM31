package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("step2");
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false);
		
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
		
		
	}

}
