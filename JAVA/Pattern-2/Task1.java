package Pattern2;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no : ");
	    int n=sc.nextInt();
	    
		 for(int i = 0; i < n; i++){
	            for(int j = 0; j < n; j++){

	                // top & bottom row
	                if(i == 0 || i == n - 1){
	                    System.out.print("*");
	                }

	                // X pattern
	                else if(j == i || j == n - i - 1){
	                    System.out.print("*");
	                }

	                // spaces
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	}

}
