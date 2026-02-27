package javaIntro_Surender;
import java.util.*;
public class Checkpositive {

	public static void main(String[] args) {
//		5.Inside a method, a local variable value is assigned only when input is positive.
//		The method returns value at the end.Check compilation validity.

		Scanner sc= new Scanner (System.in);
		System.out.println("enter the no: ");
		int value=sc.nextInt();
		
		Checkpositive done=new Checkpositive();
		
		
		int finish = done.check(value);
		if (finish==0) {
			System.out.println("enter the positive values :  ");
		}
		else {
			System.out.println(finish);
		}
	}
    public int check(int value) {
    	int values=value;
    	
    	if(values>0) {
    		System.out.println("POSITIVE");
    		return values;
    	}
    	else {
    		return 0;
    	}
    	
    }
	
	
}
