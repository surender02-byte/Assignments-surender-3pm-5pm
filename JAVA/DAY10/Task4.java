package Assignments10;
//4.Write a program to find the largest element in an array.
import java.util.*;
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		
		System.out.println("enter the array valus: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for (int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else {
				System.out.println("one duplicate no: "+arr[i]);
			}
		}
		System.out.println("largest number: "+max);
	}

}
