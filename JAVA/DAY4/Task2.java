package Assignment4;
//2.Create a simple ATM program:
//Initial balance = 10000
//Ask user to enter withdrawal amount
//If amount > balance → Print "Insufficient Balance"
//Else if amount <= 0 → Print "{"
//Else → Deduct amount and print remaining balance
//👉 Use while loop to allow multiple withdrawals until user enters 0 to exit.
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int Initialbalance=10000;
		
		boolean A=true;
		while(A) {
			System.out.println("enter the widthdrawal amount: ");
			int Widthdraw =sc.nextInt();
			
			if(Widthdraw==0) {
				A=false;
				}
				
			if(Widthdraw>Initialbalance) {
				System.out.println("Insufficient Balance");
			}
			else if(Widthdraw<=0) {
	            System.out.println("Invalid Amount");
			}
			else
			{
				Initialbalance=Initialbalance-Widthdraw;
				System.out.println("Deduct amount"+Widthdraw  + " print remaining balance:"+Initialbalance);
		}
			}
		}

		
			
		
		}
		
	
	


