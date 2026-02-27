package javaIntro_Surender;
import java.util.*;
public class Totalassigin {

	public static void main(String[] args) {
//		4.A local variable total is assigned inside an if condition when items are available in stock.
//		The value of total is printed outside the condition block.
  
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value: ");
		
		int value=sc.nextInt();
		
		Totalassigin total=new Totalassigin();
		
		total.Check(value);
		
	}
	public void Check(int value) {

	    int stock = value;
	    int output;

	    if(stock > 0) {
	        output = stock + 100;
	    } else {
	        output = 0;  
	    }

	    System.out.println("stock : " + output);
	}
}
