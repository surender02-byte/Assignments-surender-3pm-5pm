package Assignments16_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Student_record_1 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
	 static final String USER = "root";
	 static final String PASS = "admin";
	public static void main(String[] args) {

		     // Class.forName("com.mysql.jdbc.Driver");

		     try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

		         PreparedStatement stmt = conn.prepareStatement(
		                 " insert into Student(id,name, marks) values(?,?,?)"
		         );

//		         stmt.setInt(1, 110);        // specifies the first parameter
//		         stmt.setString(;2, "Sura");
//		         stmt.setInt(3, 24);
//		         stmt.setString(4, "male")
		         stmt.setInt(1,02);
		         stmt.setString(2, "susu");
		         stmt.setInt(3, 100);

		         int i = stmt.executeUpdate();

		         System.out.println(i + " records inserted");

		         conn.close();

		     } catch (Exception e) {
		        System.out.println(e.getMessage());
		     }
		 }
		
	}


