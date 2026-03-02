package Assignment2;
import java.util.*;
class Detial{
	int Acno;//instance variable
	String Acholder;//instance variable
	static String Bank="SBI";//instance variable
	double accountbalance;//instance variable
	
	public void display() {
		System.out.println("/n Acno: "+ Acno);
		System.out.println("Acholder: "+ Acholder);
		System.out.println("Bank: "+ Bank);
		System.out.println("accountbalnce : "+ accountbalance);
		
	}
	public void widthdraw(double amount){
		
		double am=amount;//local variable
		accountbalance=accountbalance-am;
		
	}
}

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Detial s1=new Detial();
        s1.Acno=12345678;
        s1.Acholder="Surender";
        s1.accountbalance=5000;
        
//        Detial s2=new Detial();
//        s2.Acno=12345678;
//        s2.Acholder="Surender";
//        s2.accountbalance=3000;
        
        System.out.println("before widthdraw amount");
        s1.display();
        
        System.out.println("enter the widthdraw amount");
        double widthdrawAm=sc.nextDouble();
        s1.widthdraw(widthdrawAm);
        
        System.out.println("after widthdraw amount");
        s1.display();
        
	}

}
