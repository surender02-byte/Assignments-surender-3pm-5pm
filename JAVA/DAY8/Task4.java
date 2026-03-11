package Assignments8;

//4. Login Authentication System (Compile-Time Polymorphism)
//A system allows users to log in using different methods.
//Task:
//Create a class LoginSystem.
//Overload the method login() for:
//login(String username, String password)
//login(String email, String password)
//login(long mobileNumber, int otp)
//Demonstrate all login methods in the main() method.

class LoginSystem{
	String username;
	String password;
	String email;
	long mobileNumber;
    void login(String username1,String password1){
		if (username.equals(username1)) {
			if(password.equals(password1)){
				System.out.println("usernmae and password successfully login");
			}
			else {
				System.out.println("enter the valied password");
			}
		}else {
			System.out.println("enter the valied usernmae");
		}
		
	}
    void login(String email1, String password2,boolean loginsystem) {
    	if (email.equals(email1)) {
			if(password .equals(password2)){
				System.out.println("email and password successfully login");
			}
			else {
				System.out.println("enter the valied password");
			}
		}else {
			System.out.println("enter the valied email");
		}
    }
    
    void login(long mobileNumber1,int otp) {
    	
    	if (mobileNumber==mobileNumber1) {
			if(otp==2028){
				System.out.println("mobilenumber and password successfully login");
			}
			else {
				System.out.println("enter the valied oTP");
			}
		}else {
			System.out.println("enter the valied mobilenumber");
		}
    }
}
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginSystem l1=new LoginSystem();
		l1.username="surender";
		l1.password="8903004410";
		
		LoginSystem l2=new LoginSystem();
		l2.email="surendersubu2028@gmail.com";
		l2.password="7402374544";		
		
		LoginSystem l3=new LoginSystem();
        l3.mobileNumber=6382702068l;
		
        l1.login("surender", "8903004410");
        l2.login("surendersubu2028@gmail.com","7402374544",true);
        l3.login(6382702068l, 20288);
	}

}
