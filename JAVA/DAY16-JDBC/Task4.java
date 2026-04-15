package Assignments16_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_multiple_columns_4 {


		// TODO Auto-generated method stub
		static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
		 static final String USER = "root";
		 static final String PASS = "admin";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

			         PreparedStatement stmt = conn.prepareStatement(
			                 " update student set marks=?,name=? where id=?"
			         );


			         stmt.setInt(1, 98);
			         stmt.setString(2, "Sura");
			         stmt.setInt(3, 1);

			         int i = stmt.executeUpdate();

			         System.out.println(i + " records inserted");

			         conn.close();

			     } catch (Exception e) {
			        System.out.println(e.getMessage());
			     }
	}

}
