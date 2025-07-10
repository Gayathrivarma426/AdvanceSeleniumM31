import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataToDataBase {

	public static void main(String[] args) throws Throwable {
		
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedata", "root", "Gayathri@123");
		
		
         Statement state = conn.createStatement();
		
		String query = "insert into EmployeeData(firstName,lastName,address)values('suresh','kumar','vishakapatanam')";
		int result = state.executeUpdate(query);
		if(result == 1)
		{
			System.out.println("data is created");
		}
		else 
		{
			System.out.println("data not created");
		}
		conn.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
