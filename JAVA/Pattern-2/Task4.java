package Pattern2;

import java.util.Scanner;

public class ReverseTriangleStar {
    //18.question
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no : ");
	    int n=sc.nextInt();
	    
	    int temp=n;
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=n;j++) {
	    		if(j<=temp) {
	    			if(i==1 || j==1 || j==temp) {
	    		System.out.print("*");
	    		}
	    			else {
	        			System.out.print(" ");
	        		}
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    		    	}
	    	temp--;
	    	System.out.println();
	    }
	    
		
	}

}
