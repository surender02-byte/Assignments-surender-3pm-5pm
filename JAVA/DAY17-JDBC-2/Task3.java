package Assignments17_JDBCStoredProcedure;
//3.Write a program to insert user data using a stored procedure with input parameters.
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insert_user_data_3 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
    static final String USER = "root";
    static final String PASS = "admin";
    
public static void main(String[] args) {
	// TODO Auto-generated method stub
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

        // Calling stored procedure
        CallableStatement cs = conn.prepareCall("call updateusers( ?, ?, ?)");

        // IN parameter
        cs.setInt(1, 01);
        cs.setString(2, "Sura");
        cs.setInt(3, 24);



        // Execute
        cs.execute();



    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
}
}
