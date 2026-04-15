package Assignments17_JDBCStoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//2.Create a stored procedure to add employee details and call it using CallableStatement.
public class Employee_details_2 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
	 static final String USER = "root";
	 static final String PASS = "admin";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

			  CallableStatement stmt = conn.prepareCall("{call updateemployee(?, ?, ?, ?)}");

	            stmt.setInt(1, 3);
	            stmt.setString(2, "susub");
	            stmt.setInt(3, 40000);
	            stmt.setInt(4, 103);

	            int i = stmt.executeUpdate();

	            System.out.println(i + " record inserted successfully");

		         conn.close();

		     } catch (Exception e) {
		        System.out.println(e.getMessage());
		     }
	}

}
