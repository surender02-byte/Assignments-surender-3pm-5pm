package Pattern2;

import java.util.Scanner;

public class pattern3 {
//27 question
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no : ");
	    int n=sc.nextInt();
	    
	    boolean stata=true;
	    int temp =n;
	    int i=1;
	    while (i<=n && i>=0) {
	    	for(int j=1;j<=n;j++) {
	    		if(j>=temp) {
	    			if(j==n  || j==temp){
	    				System.out.print("* ");
	    			}
	    			else 
	    				System.out.print("  ");
	    			
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	}System.out.println();
	    	
	    	
	        if(i<n && stata) {
	        	temp--;
	    	   i++;
	        }
	        else {
	        	stata=false;
	           i--;
	           temp++;
	        }
	    }
	}

}
