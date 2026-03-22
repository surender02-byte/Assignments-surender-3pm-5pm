package Pattern2;

import java.util.Scanner;

public class IveratedV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no : ");
	    int n=sc.nextInt();
	    
	            for(int i = 0; i < n/2 + 1; i++){
	                for(int j = 0; j < n; j++){

	                    if(i == 0) {
	                        System.out.print("*");
	                    }
	                    else if(j == i || j == n - i - 1) {
	                        System.out.print("*");
	                    }
	                    else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	        }
	    
	}


