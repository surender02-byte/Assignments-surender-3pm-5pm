package Assignment2;
import java.util.*;
//3.An employee salary system stores employee ID and basic salary for the entire object lifecycle.
//Bonus amount is calculated temporarily inside a method.
//👉 Design a class using correct variable types.
class EmployeeDetail {
	int employeID;//instance variable 
	String employeName;//instance variable 
	Double salary;//instance variable 
	
 public void display() {
	 System.out.println("Employee ID: "+employeID);
	 System.out.println("Employee NAME: "+employeName);
	 System.out.println("Employee Basic Salaty: "+salary);
 }
 
 public void Bonus(Double amount) {
	  Double incrementamount=amount;
	  salary=(salary+(salary*incrementamount)/100);
}

}
public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		EmployeeDetail  s1=new EmployeeDetail ();
        s1.employeID=123456;
        s1.employeName="SURENDER";
        s1.salary=1000.0;
        
        System.out.println("without bounes");
        s1.display();
        
        System.out.println("enter the bounes amount");
        Double bounes=sc.nextDouble();
        s1.Bonus( bounes);
        
        System.out.println("Your bounes amount IS: ");
        s1.display();
        
	}

}
