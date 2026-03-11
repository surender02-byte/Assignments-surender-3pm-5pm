package Assignments8;

//3. Employee Bonus System (Runtime Polymorphism)
//A company provides different bonus calculations for Manager, Developer, and Intern.
//Task:
//Create a parent class Employee with a method calculateBonus().
//Create subclasses Manager, Developer, and Intern.
//Override the method in each class to display different bonus calculations.
//Demonstrate runtime polymorphism using a parent reference.

class Employee{
	int empID;
	String empName;
	double salary;
	void calculateBonus() {
		System.out.println("without bonus: "+salary);
	}
}
class Manager extends Employee{
	void calculateBonus() {
	double	bonus=salary+salary*20/100;
		System.out.println("empid: "+empID +"empaName :"+empName+ "manager salary: "+bonus);
	}
}
class Developer extends Employee{
	void calculateBonus() {
		double bonus=salary+salary*15/100;
		System.out.println("empid: "+empID +"empaName :"+empName+ "developer salary: "+bonus);

	}
}
class Intern extends Employee{
	void calculateBonus() {
		double bonus=salary+salary*10/100;
		System.out.println("empid: "+empID +"empaName :"+empName+ "manager salary: "+bonus);

	}
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1=new Employee();
     e1.empID=01;
     e1.empName="susu";
     e1.salary=100000;
     e1.calculateBonus();
     
     Manager  m1=new Manager();
     m1.empID=101;
     m1.empName="susu";
     m1.salary=100000;
     m1.calculateBonus();
     
     Developer  d1=new Developer();
     d1.empID=012;
     d1.empName="susu";
     d1.salary=100000;
     d1.calculateBonus();
     
     Intern  i1=new Intern();
     i1.empID=041;
     i1.empName="susu";
     i1.salary=100000;
     i1.calculateBonus();
    
	}
}
