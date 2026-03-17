package Assignments10;
//5.Write a program to find the smallest element in an array.
import java.util.*;
public class SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        
        System.out.println("enter the array value: ");
        for(int i=0;i<size;i++) {
        	arr[i]=sc.nextInt();      
        	}
        
        int min=arr[0];
        for(int i=0;i<size;i++) {
        	if(arr[i]<min) {
        		min=arr[i];
        	}
        }
        System.out.println("smallest number: "+min);
	}

}
