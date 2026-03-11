package Assignments7;
//1. Employee Salary Initialization
//Create a class Employee with the following fields:
//empId
//empName
//salary
//Requirements:
//Use a parameterized constructor to initialize all the fields.
//Create 3 employee objects with different values.
//Display the employee details using a method displayEmployee().

class Employee{
	int empID;
	String empName;
	double Salary;
	Employee(int e,String n,double s){
		empID=e;
		empName=n;
		Salary=s;
	}
	void displayEmployee() {
		System.out.println("EmpID: "+empID+"EMPNAME: "+empName+"Salary: "+Salary);
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee s1=new Employee(1,"susu",10000);
		
		Employee s2=new Employee(2,"suszy",150000);
		
		Employee s3=new Employee(3,"susb",199999);
		
		s1.displayEmployee();
		s2.displayEmployee();
		s3.displayEmployee();
	}

}
