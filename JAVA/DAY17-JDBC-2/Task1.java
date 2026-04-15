package Assignments17_JDBCStoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

//1.Write a JDBC program to call a stored procedure that inserts a student record (id, name, marks).
public class Call_a_stored_procedure_1 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/studentRecord";
    static final String USER = "root";
    static final String PASS = "admin";
    
public static void main(String[] args) {
	// TODO Auto-generated method stub
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {

        // Calling stored procedure
        CallableStatement cs = conn.prepareCall("call updateStudent( ?, ?, ?)");

        // IN parameter
        cs.setInt(1, 102);
        cs.setString(2, "Susub");
        cs.setInt(3, 100);

        // OUT parameters
//        cs.registerOutParameter(2, Types.INTEGER); // count
//        cs.registerOutParameter(3, Types.DECIMAL); // min
//        cs.registerOutParameter(4, Types.DECIMAL); // avg
//        cs.registerOutParameter(5, Types.DECIMAL); // max

        // Execute
        cs.execute();

        // Get OUT values
//        int count = cs.getInt(2);
//        System.out.println("Make count is " + count);
//
//        float min = cs.getFloat(3);
//        System.out.println("Min value is " + min);
//
//        float avg = cs.getFloat(4);
//        System.out.println("Avg value is " + avg);
//
//        float max = cs.getFloat(5);
//        System.out.println("Max value is " + max);

    } catch (SQLException e) {
       System.out.println(e.getMessage());
    }
		
	}

}
