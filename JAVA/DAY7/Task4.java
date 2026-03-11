package Assignments7;
import java.util.*;
//4. Bank Account Deposit Scenario
//Create a class BankAccount with:
//accountNumber
//accountHolderName
//balance
//Requirements:
//Initialize all fields using a parameterized constructor.
//Create a method deposit(double amount) to add money to balance.
//Create a method displayBalance() to show account details.
//In main, create one account object, deposit money, and print the updated balance.
class Account{
	int accountNumber;
	String accountHolderName;
	double balance;
	Account(int n,String h,double b){
     accountNumber=n;
	 accountHolderName=h;
	 balance=b;
	}
	void deposit(double amount) {
		balance=balance+amount;
	}
	void displayBalance() {
		System.out.println("update balance: "+balance);
	}
}
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the amount: ");
		double amount=sc.nextDouble();
		Account s1=new Account(890300,"susu",1000);
		s1.deposit(amount);
		s1.displayBalance();
        
	}

}
