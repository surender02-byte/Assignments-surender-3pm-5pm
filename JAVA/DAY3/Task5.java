package Assignment3;

import java.util.Scanner;

//Write a Java program to check whether a number is positive, negative or zero.
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value: ");
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        if (num>0) {
        	System.out.println("Positive value");
        }
        else if (num<0) {
        	System.out.println("Negative value");
        }
        else {
        	System.out.println("Zero value");
        }
	}

}
