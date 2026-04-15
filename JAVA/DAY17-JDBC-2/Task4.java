package Assignments17_JDBCStoredProcedure;
//4.Write a JDBC program to call a stored procedure to update student marks based on ID.
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Update_student_marks_based_on_ID_4 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
    static final String USER = "root";
    static final String PASS = "admin";
    
public static void main(String[] args) {
	// TODO Auto-generated method stub
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

        // Calling stored procedure
        CallableStatement cs = conn.prepareCall("call updateStudentMarks( ?, ?)");

        // IN parameter
        cs.setInt(1, 101);
       // cs.setString(2, "Sura");
        cs.setInt(2,97);



        // Execute
        cs.execute();

        System.out.println("Student marks updated successfully");

    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }

}}
