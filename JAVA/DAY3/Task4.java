package Assignment3;

import java.util.Scanner;

//Write a Java program to find sum of first N natural numbers.
public class Task4 {
       static int sum=0;
	public static int  natural(int n) {
		if (n==0) {
			return sum;
		}
		sum=sum+n;
		return natural(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value: ");
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
       
        System.out.println(natural (num));
	}

}
