package javaIntro_Surender;
import java.util.*;
public class Discountvalue {

	public static void main(String[] args) {
		// .An e-commerce application calculates discount only when order amount exceeds ₹5000.
		//The discount value is printed after the condition block.

		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter the amount : ");
		int price = sc.nextInt();
		
		Discountvalue value= new Discountvalue();
		value.Discount(price);
	}
	
	public void Discount(int price) {
		int tempvalue=price;
		
		if (tempvalue>5000) {
			System.out.println("your product is dicount 50%");
		}
		else {
			System.out.println("your product is NOT dicount");
		}
		
		
	}

}
