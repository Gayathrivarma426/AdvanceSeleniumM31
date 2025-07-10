package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	
	//Assert Equals method
	
	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		
		Assert.assertEquals(true,true);
		
		System.out.println("Step3");
		System.out.println("Step4");
	}
	
	@Test
	public void m2()
	{
		String expdata="Qspiders";
		String actdata="Qspiders";
		Assert.assertEquals(actdata, expdata);
	}
	@Test
	public void m3()
	{
		String expdata="Qspiders";
		String actdata="Qspiders";
		Assert.assertEquals(actdata, expdata, "Assert Fail");
		System.out.println("Assert passed");
	}
	@Test
	public void m4()
	{
		int actdata=10;
		int expdata=20;
		Assert.assertEquals(actdata, expdata, "Assert Fail");
		System.out.println("Assert passed");
	}
	
	//Assert Not Equal Method
	@Test
	public void m5()
	{
		int actdata =25;
		int expdata =35;
		Assert.assertNotEquals(actdata, expdata, "Assert Equal");
		System.out.println("Assert not Equal");
		
	}
	
  //Assert True Method
	@Test
	public void m6()
	{
		
		String actdata="Gayathri";
		String expdata="Gayathri";
		Assert.assertTrue(actdata.equals(expdata), "Assert Fail");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m7()
	{
		
		String actdata="Gayathri";
		String expdata="GayathrI  ";
		Assert.assertTrue(actdata.equals(expdata), "Assert Fail");
		System.out.println("Assert pass");
	}
	
	//Assert False method
	@Test
	public void m8()
	{
		String expdata="Welcome";
		String actdata="WelcomE";
		Assert.assertFalse(actdata.equals(expdata), "Assert Fail");
		System.out.println("Assert pass");
		
	}
	
	@Test
	public void m9()
	{
		String expdata="Welcome";
		String actdata="Welcome";
		Assert.assertFalse(actdata.equals(expdata), "Assert Fail");
		System.out.println("Assert pass");	
		
	}
	
	//Assert null
	@Test
	public void m10()
	{
		String s = null;
		Assert.assertNull(s, "Assert Fail");
		System.out.println("Assert Pass");
	}
	
	@Test
	public void m11()
	{
		String s= "Qspider";
		Assert.assertNull(s, "Assert Fail");
		System.out.println("Assert pass");
	}
	
	//Assert not null method
	@Test
	public void m12()
	{
		String a = "qspiders";
		Assert.assertNotNull(a, "Assert Fail");
		System.out.println("Assert pass");
	}
	
	@Test
	public void m13()
	{
		String a=null;
		Assert.assertNotNull(a, "Assert Fail");
		System.out.println("Assert pass");
	}
	
	//Assert same
	@Test
	public void m14()
	{
		String actdata="lakshit";
		String expdata="lakshit";
		Assert.assertSame(expdata, actdata, "Assert Fail");
		System.out.println("Assert pass");
	}
	@Test
	public void m15()
	{
		int actdata=10;
		int expdata=20;
		Assert.assertSame(expdata, actdata, "Assert Fail");
		System.out.println("Assert pass");
	}
	
	//Assert not same
	@Test
	public void m16()
	{
		int actdata=10;
		int expdata=20;
		Assert.assertNotSame(expdata, actdata, "Assert Fail");
		System.out.println("Assert pass");
	
	}
	
	
	@Test
	public void m17()
	{
		String actdata="thanvi";
		String expdata="thanvi";
		Assert.assertNotSame(expdata, actdata, "Assert Fail");
		System.out.println("Assert pass");
	}
	
	//Assert fail
//	public void m18()
//	{
//		int exp=20;
//		int act =20;
//		Assert.assertfail("");
//	}
//	
	

}
