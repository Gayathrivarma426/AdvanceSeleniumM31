package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	//DataProvider-This method isused to execute the method multiple times with different set of data
	
	@Test(dataProvider = "getData")
	public void bookTickets(String src,String dest,int NoOfPeople)
	{
		System.out.println("Book Tickets from "+ src +"to "+ dest +" and Total number of people "+ NoOfPeople+"");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		 Object[][] objArr = new Object[3][3];
		 objArr[0][0]="Bangalore";
		 objArr[0][1]="Goa";
		 objArr[0][2]=20;
		 
		 objArr[1][0]="Bangalore";
		 objArr[1][1]="Pune";
		 objArr[1][2]=25;
		 
		 objArr[2][0]="Bangalore";
		 objArr[2][1]="Mysore";
		 objArr[2][2]=30;
		
		return objArr;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
