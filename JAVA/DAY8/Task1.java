package Assignments8;
//1.Online Payment System (Runtime Polymorphism)
//An E-commerce application supports multiple payment methods like Credit Card, Debit Card, and UPI.
//Task:
 //Create a parent class Payment with a method processPayment().
//Create child classes CreditCardPayment, DebitCardPayment, and UPIPayment.
// the processPayment() method in each child class to display different payment messages.
//In the main() method, use parent reference and child objects to demonstrate runtime polymorphism.
class Payments{
       void processPayment(){
		System.out.println("payment methods successfully");
	}
}
class CreditCardPayment extends Payments{
	 void processPayment(){
			System.out.println("payment methods successfully in  CreditCardPayment ");
		}
}
class DebitCardPayment extends Payments{
	void processPayment(){
		System.out.println("payment methods successfully in  DebitCardPayment ");
	}
}
class UPIPayment extends Payments{
	void processPayment(){
		System.out.println("payment methods successfully in  UPIPayment ");
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        CreditCardPayment s2=new CreditCardPayment();
        s2.processPayment();
        DebitCardPayment s3=new DebitCardPayment();
        s3.processPayment();
        UPIPayment s4 = new UPIPayment();
        s4.processPayment();
	}

}
