package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTest {
	//=================================PRIORITY==========================================================================
	//priority - priority tell which method execute first if we give (@Test(priority=-1),@Test(priority=0),@Test(priority=1))
	//execution order = -1,0,1
//	@Test(priority=1)
//	public void createProduct()
//	{
//		System.out.println("Product is created");
//		
//	}
//	
//	@Test(priority =-1)
//	public void modifyProduct()
//	{
//		System.out.println("Product is modified");
//	}
//	
//	@Test(priority=0)
//	public void deleteProduct()
//	{
//		System.out.println("Product is deleted");
//	}
//	
	//===============================ENABLED AND IGNORE=================================================================
	//ENABLED- if we dont want to execute any method we have to give (@Test(Enabled=false)) then this method will not execute
	//Ignore- also work same like enabled .instead of enebled we can use Ignore(@Test
	 //                                                                         @Ignore )under @test we have to write @Ignore
	
	
//	@Test(priority=1)
//	@Ignore
//	public void createProduct()
//	{
//		System.out.println("Product is created");
//		
//	}
//	
//	@Test(enabled =false)
//	public void modifyProduct()
//	{
//		System.out.println("Product is modified");
//	}
//	
//	@Test(priority=0)
//	public void deleteProduct()
//	{
//		System.out.println("Product is deleted");
//	}
	//====================================Dependendes on method=============================================================
	//dependes on method - used to depend on previous methods  (@Test(dependsOnMethods="createProduct"),that means this 
	//present method dependent on "create product" method
	//if create product method got failed then Present method will not get executed , it will skip.
	//when we are using priority and depends on method  depends on method executes first
	//when we first method = pass and second method =fail give both the dependencies to third method ,3rd method got skip
	//
//	
//	@Test
//	public void createProduct()
//	{
//		
//		System.out.println("Product is created");
//		
//	}
//	
//	@Test
//	
//	public void modifyProduct()
//	{
//		
//		System.out.println("Product is modified");
//	}
//	
//	@Test(dependsOnMethods = {"createProduct", "modifyProduct"})
//	public void deleteProduct()
//	{
//		System.out.println("Product is deleted");
//	}
//	
	//====================================Invocation==============================================================
	//inovocation - if we want to execute particular method multiple times with the same set of data.
	//if we are giving priority and invocation count to @Test annotation , it will executes according to the priority  
	

//	@Test(invocationCount = 3,priority=3)
//	public void createProduct()
//	{
//		
//		System.out.println("Product is created");
//		
//	}
//	
//	@Test(priority=1)
//	
//	public void modifyProduct()
//	{
//		
//		System.out.println("Product is modified");
//	}
//	
//	@Test(priority=2)
//	public void deleteProduct()
//	{
//		System.out.println("Product is deleted");
//	}
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
