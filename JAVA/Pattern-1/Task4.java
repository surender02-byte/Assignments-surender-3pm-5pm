package Pattern1;
import java.util.*;
public class NumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        
        int temp=n-1;
        for (int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(j>=temp) {
        			System.out.print(i+1 +" ");
        		}else {
        			System.out.print(" ");
        		}
        	}temp--;
        	System.out.println();
        }
	}

}
