package Assignment5;
//2.Create a class BankAccount:
//Instance variables: accountNumber, accountHolderName, balance
//Methods:
//deposit(amount)
//withdraw(amount)
//displayBalance()
//Create 2 account objects.
//Perform deposit and withdrawal operations.
//👉 Add validation: Prevent withdrawal if balance is insufficient.
import java.util.*;
 class BankAccount{
	int accountNumber;
	String accountHolderName;
	double  balance;
	
  public void deposit(double amount) {
		 balance= balance+amount;
		 System.out.println("depost ammount: "+balance);
	}
  
  public void withdraw(double amount ) {
	  
	   if(balance <= 0) {
	        System.out.println("Account balance is zero. Cannot withdraw.");
	        return;
	    }
	   if(balance <amount)
	   {
			System.out.println("Balance is insufficient");
			return;
		}
	   else
		{
	     balance =balance-amount;
		 System.out.println("withdraw amount: "+balance);
		 }
	   
   }
  
  public void Displaybalance() {
	   System.out.println("your account no: "+ accountNumber);
	   System.out.println("your accountHoldername: "+ accountHolderName);
	   System.out.println("Account Balance: "+balance);
   }
	
}

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		BankAccount s1=new BankAccount();
		s1.accountNumber=12345;
		s1.accountHolderName="surender";
		s1.balance=10000;
		
		BankAccount s2=new BankAccount();
		s2.accountNumber=54321;
		s2.accountHolderName="deeps";
		s2.balance=20000;
		
		System.out.println("enter the before amount ");
		s1.Displaybalance();
		
		 System.out.println("enter the desposit amount: ");
		 double amount=sc.nextDouble();
		 s1.deposit(amount);
		 
		 System.out.println("enter the widthdraw amount: ");
		 double amounts=sc.nextDouble();
		 s1.withdraw(amounts);
		 
		 s1.Displaybalance();

	}

}
