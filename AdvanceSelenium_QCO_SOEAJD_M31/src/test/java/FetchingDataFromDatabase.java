import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchingDataFromDatabase {

	public static void main(String[] args) throws Throwable {
		
	//	Register/load the my sql database
		
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
	//get connect to database	
		
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedata", "root", "Gayathri@123");
		 
	//create sql statement
		 
		Statement state = conn.createStatement();
		
		String query = "select * from Employeedata";
		
	//Execute statement query
		
		ResultSet result = state.executeQuery(query);
		
		while (result.next()) 
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
			
		}
		
	//close the connection
		conn.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
