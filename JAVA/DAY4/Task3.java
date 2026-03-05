package Assignment4;

//3.Write a program to check whether a given number is an Armstrong number using a while loop
//Example:
//Input: 153
//Output: Armstrong Number
//(153 = 1³ + 5³ + 3³)
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter a number:");
		        int num = sc.nextInt();

		        int original = num;
		        int sum = 0;

		        while (num != 0) {

		            int digit = num % 10;      
		            sum = sum + (digit * digit * digit);  

		            num = num / 10;            
		        }

		        if (sum == original) {
		            System.out.println("Armstrong Number");
		        } else {
		            System.out.println("Not an Armstrong Number");
		        }

	}

}
