package Assignments12;
import java.util.*;
//2.Create a login system where:
//Invalid username → custom exception
//Invalid password → different exception
//After 3 failed attempts → terminate program

class LoginExceptions extends Exception{
	
	public LoginExceptions(String message) {
		super(message);
	}
}


class LoginSystem{
	String name;
	long password;
	int count =0;
	
	 LoginSystem(String name, long password) {
		this.name = name;
		this.password = password;
	}
	
	
	void Login(String username,long userpassword ) throws LoginExceptions {
		if (count==3) {
			throw new LoginExceptions ("3 attempts over. Reset your account");
		} if(name.equals(username)) {
		  if(password==userpassword) {
			  count++;
			 throw new LoginExceptions("your login Successfully");
		}
		 else {
			 count++;
			 throw new LoginExceptions("enter the vailed Password");
		 }
	
		}
	     else {
	    	 count++;
	    	 throw new LoginExceptions("enter your vailed username");
	    	
		}
	}
	
	
}



public class Exception_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		LoginSystem s1=new LoginSystem("Surender",8903004410l);
		
		while (true) {
			
			System.out.println("Enter the username : ");
			String UserName=sc.nextLine();
			
			System.out.println("Enter the userpassword : ");
			long UserPassword=sc.nextLong();
			sc.nextLine();
		
		try {
			s1.Login(UserName,UserPassword);
			break;
		}
		catch(LoginExceptions e) {
			System.out.println(e.getMessage());
			if (s1.count==3) {
				System.out.println("3 attempts over. Reset your account");
				break;
			}
		}
	
	}
		}

}
