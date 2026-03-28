package Assignments12;

import java.util.Scanner;

class TryAndFinally {
	int Checkdivision(int number,int number1) {
		int num=0;
		try {
			num=number/number1;
			return num;
		}
		catch(Exception e) {
			System.out.println("Error : " +e.getMessage());
		}
		finally {
			return num;
		}
	}
}
public class Exception_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the div value : ");
		int div=sc.nextInt();
		System.out.println("Enter the div1 value : ");
		int div1=sc.nextInt();
		TryAndFinally s1=new TryAndFinally();
		int result = s1.Checkdivision(div, div1);
		 
		if(result==0) {
	        	System.out.println("Retun form Finally");
	        }
	        else {
	        	System.out.println("No Error \n Retun form try");
	        }
		
	}

}
