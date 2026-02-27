package javaIntro_Surender;
import java.util.*;
public class Gradingsystem {

	public static void main(String[] args) {
//		2.A program assigns grade based on marks using multiple if-else if conditions.
//		The grade is displayed after conditions execution.
//		Verify whether Java guarantees initialization of the local variable.
 
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your marks : ");
		int mark=sc.nextInt();
		
		if(mark>=90) {
			System.out.println("A grade : "+mark);
		}
		else if (mark>=80) {
			System.out.println("A+ grade : "+mark);
		}
		else if(mark>=70) {
			System.out.println("B grade : "+mark);
		}
		else if(mark>=60) {
			System.out.println("B+ grade : "+mark);
		}
		else if(mark>=50) {
			System.out.println("C grade : "+mark);
		}
		else {
			System.out.println("FAIL : "+mark);
		}
		
		
	}

}
