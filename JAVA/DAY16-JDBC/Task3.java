package Assignments16_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_employee_salary_3 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
	 static final String USER = "root";
	 static final String PASS = "admin";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

		         PreparedStatement stmt = conn.prepareStatement(
		        		//" insert into employee (id,employee_name,employee_salary,department_id) values(?,?,?,?)"
		        		 " update employee set employee_salary=? where department_id=?"
		         );


//		         stmt.setInt(1, 02);
//		         stmt.setString(2, "susu");
		         stmt.setInt(1,300000);
		         stmt.setInt(2, 101);

		         int i = stmt.executeUpdate();

		         System.out.println(i + " records inserted");

		         conn.close();

		     } catch (Exception e) {
		        System.out.println(e.getMessage());
		     }
	}

}
