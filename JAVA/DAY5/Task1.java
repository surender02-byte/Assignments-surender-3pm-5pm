package Assignment5;

//1.Create a class Employee with the following:
//Instance variables: empId, empName, basicSalary
//Method to calculate:
//HRA = 20% of basic
//DA = 10% of basic
//Gross Salary = basic + HRA + DA
//Create 3 employee objects and display their gross salary.
//👉 Add a condition: If basic salary > 50000, give 5% bonus
import java.util.*;
class Employee{
	int empID;
	String empName;
    double basicSalary;

     void Display() {
	   double HRA=((basicSalary*20)/100);
    	   double DA=((basicSalary*10)/100);
       double GrossSalary=(basicSalary+HRA+DA);
       if (basicSalary>50000) {
    	       GrossSalary += basicSalary*5/100;
       }
       System.out.println("\nEmployee "+empName+" Gross Salary is "+GrossSalary);
}
}
public class Task1 {

	public static void main(String[] args) {
		
		Employee s1=new Employee();
		s1.empID=101;
		s1.empName="Surender";
		s1.basicSalary=45000;
		
		Employee s2=new Employee();
		s2.empID=102;
		s2.empName="deeps";
		s2.basicSalary=60000;
		
		Employee s3=new Employee();
		s3.empID=103;
		s3.empName="abdullah";
		s3.basicSalary=49000;
		
		s1.Display();
		s2.Display();
		s3.Display();

	}

}

