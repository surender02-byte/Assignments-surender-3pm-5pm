package Assignment9;
import java.util.*;
//1.An e-commerce website allows customers to pay using different payment methods such as Credit Card, UPI, and PayPal. Each payment method processes the payment differently.
//Question:
//Design an interface Payment with method processPayment(double amount).
//Create classes:
//CreditCardPayment
//UPIPayment
//PayPalPayment
//Each class should implement the interface and provide its own payment processing logic.
 interface Payments{
	void processPayment(double amount);
}

class CreditCard implements Payments{
    public void processPayment(double amount) {
	System.out.println("this is a CreditCard amount  : "+amount*7);
	}
}

class UPIPayment implements Payments{
	public void processPayment(double amount) {
		System.out.println("this is a UPIPayment : "+amount*9);
	}
}

class PayPalPayment implements Payments{
   public void processPayment(double amount) {
		System.out.println("this is a PayPalPayment : "+amount*11);
	}
}

public class InterfacePayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the CreditCard amount : ");
		double amount = sc.nextDouble();
		Payments s1=new CreditCard();
		s1.processPayment(amount);
		
		System.out.println("enter the UPIPayment amount : ");
		double amount1 = sc.nextDouble();
		Payments s2= new UPIPayment();
		s2.processPayment(amount1);
		
		System.out.println("enter the PayPalPayment amount : ");
		double amount2 = sc.nextDouble();
		Payments s3= new PayPalPayment();
		s3.processPayment(amount2);
		
		
	}

}
