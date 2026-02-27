package javaIntro_Surender;
import java.util.*;
public class loginsystem {

	public static void main(String[] args) {
//		3.A login system assigns a local variable status only when username and password are correct.
//		After validation, the program prints login status outside the if block.
//		Check whether the program compiles safely in all cases.
        Scanner sc=new Scanner (System.in);
        
       System.out.println("enter the USERNAME: ");
       String username= sc.next();
       
       System.out.println("enter the PASSWORD : ");
       long password =sc.nextLong();
        
       String username1="surender";
       long password1=8903004410l;
	
       if (username.equals(username1)) {
    	   if (password==password1) {
    		   System.out.println("login successfuly");
    	   }
    	   else {
    		   System.out.println("your password is incorrect");
    	   }
       }
       else {
    	   System.out.println("Enter the correct USERNAME");
       }
       
       
       
	}

}
