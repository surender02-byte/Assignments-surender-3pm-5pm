package Assignments10;
//2.Write a program to find the sum of all elements in an array.
import java.util.*;
public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int []arr=new int[size];
      
      System.out.println("enter the array values : ");
      for (int i=0;i<size;i++) {
    	  arr[i]=sc.nextInt();
      }
      
      int sum=0;
      for (int i=0;i<size;i++) {
    	  sum=sum+arr[i];
    	 
      }
      System.out.println("enter the array values : "+ sum);
      
	}

}
