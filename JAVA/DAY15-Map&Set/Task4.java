package Assignments15_Map_Set;
//4.Employee Salary Lookup
//You are building an employee system.
//👉 Task:
//Store employee ID and salary, then:
//Retrieve salary by ID
//Update salary
//Handle missing IDs

import java.util.HashMap;
import java.util.Map;

public class Store_employee_ID_and_salary {

    public static void main(String[] args) {

        Map<Integer, Integer> emp = new HashMap<>();

        // 🔹 Store employee data
        emp.put(101, 50000);
        emp.put(102, 60000);
        emp.put(103, 45000);

        System.out.println("Employee Data: " + emp);

        // 🔹 Retrieve salary by ID
        int id = 101;

        if(emp.containsKey(id)) {
            System.out.println("Salary of " + id + " → " + emp.get(id));
        } else {
            System.out.println("Employee not found");
        }

        // 🔹 Update salary
        emp.put(101, 55000);  // update

        System.out.println("Updated Salary of 101 → " + emp.get(101));

        // 🔹 Handle missing ID
        int searchId = 104;

        if(emp.containsKey(searchId)) {
            System.out.println("Salary → " + emp.get(searchId));
        } else {
            System.out.println("Employee ID " + searchId + " not found");
        }
    }
}
