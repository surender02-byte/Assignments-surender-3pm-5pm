package Assignments12;
//1.In a banking application, implement a withdrawal method where:
//If balance < withdrawal amount → throw custom exception
//If amount is negative → throw another exception
//Ensure transaction log always executes.

import java.util.Scanner;

class WithdrawalException extends Exception{

	public WithdrawalException(String message) {
		super(message);
	}
	
}

class BankingApplication{
	long AcNumber;
	String AcName;
	double balance;
	 
	
	
	public BankingApplication(long acNumber, String acName, double balance) {
		this.AcNumber = acNumber;
		this.AcName = acName;
		this.balance = balance;
	}



	void withdrawal( double amount) throws WithdrawalException {
		if (balance < amount) {
			throw new WithdrawalException("insuffical balance");
		}
		else if (0 > amount  ){
			throw new WithdrawalException("your amount is NEGATIVE ");
		}
		else {
			 balance-=amount;
			System.out.println("your blance is : " +balance);
		}
		
	}
	
}


public class Exception_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingApplication s1=new BankingApplication(123456,"SuSi",5000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double am=sc.nextDouble();
		
		
		try {
			s1.withdrawal(am);
		}
		catch(WithdrawalException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
