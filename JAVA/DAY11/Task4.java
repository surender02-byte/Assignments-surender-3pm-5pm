package Assignments11;
//4.Create an abstract class Account with an abstract method calculateInterest().
//Implement subclasses SavingsAccount and CurrentAccount.

abstract class Account{
	abstract void calculateInterest();
}
class SavingsAccount extends Account{
	void calculateInterest () {
		System.out.println("saving account");
	}
}
	class CurrentAccount extends Account{
		void calculateInterest() {
			System.out.println("currect account");
		}
	}
	
	
public class Account_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account s1=new SavingsAccount();
       s1.calculateInterest();
       
       Account s2=new CurrentAccount();
       s2.calculateInterest();
       
       
       
	}

}
