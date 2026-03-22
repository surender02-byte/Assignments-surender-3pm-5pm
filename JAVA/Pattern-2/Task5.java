package Pattern2;
import java.util.*;
public class RightTriangleStar {
   //17 question 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no : ");
	    int n=sc.nextInt();
	    
	    for(int i=0;i<n;i++) {
	    	for (int j=0;j<=i;j++) {
	    		if(i==j || i==n-1 ||j==0 ) {
	    		 System.out.print("*");}
	    		else {
	    			 System.out.print("  ");
	    		}
	    	} System.out.println();
	    }
	} 

}
