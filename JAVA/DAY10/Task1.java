package Assignments10;
///1.Write a Java program to store 5 numbers in an array and print them.
import java.util.*;
public class Store5NumbersInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int size=sc.nextInt();
        int []arr=new int[size];
       
        System.out.println("enter the arr value : ");
        for (int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++) {
        	 System.out.println(arr[i]);
        }
	}

}
