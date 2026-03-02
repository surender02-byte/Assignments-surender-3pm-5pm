package Assignment3;
//Write a Java program to count the number of digits in a number.
import java.util.*;
public class Task3 {
    
   static int count=0;
	
	public static int Digit(int n) {
		if (n==0) {
			return count;
		}
	    
		count++;
	
		return Digit(n/10) ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the value: ");
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
     
    	System.out.println("number of digits in a number: "+Digit(num));
        
        
	}

}
