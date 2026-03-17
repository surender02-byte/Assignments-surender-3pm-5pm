package Assignments10;
//3.Write a program to find the average of array elements.
import java.util.*;
public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner (System.in);
       System.out.println("enter the size: ");
       int size=sc.nextInt(); 
       int []arr=new int[size];
       
       
       System.out.println("enter the array value: ");
       for(int i=0;i<size;i++) {
    	   arr[i]=sc.nextInt();
       }
       
       int sum=0;
       for(int i=0;i<size;i++) {
    	   sum=sum+arr[i];
    	   
       }
       System.out.println("sum of the arrays is : "+(sum/size));
	}

}
