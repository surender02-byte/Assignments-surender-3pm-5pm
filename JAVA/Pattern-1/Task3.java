package Pattern1;
import java.util.*;
public class NumberIncerasingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        
        int temp=n;
        for (int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		if (j<=temp) {
        			System.out.print(j+" ");
        		}
        		
        	}
        	temp--;
        	System.out.println();
        }
        
	}

}
