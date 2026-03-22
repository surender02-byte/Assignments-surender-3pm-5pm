package Assignments11;
//2.Create an abstract class Food with an abstract method prepare().
//Implement subclasses Pizza and Burger that define their own preparation process.
abstract class Food{
	abstract void perpare();
}
class Pizza extends Food{
	void perpare(){
		System.out.println("BBQ pizza READY ");
	}
}
class Burgar extends Food{
	void perpare(){
		System.out.println("CHICKEN burgar READY ");
	}
}

public class Food_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Food s1=new Pizza();
        System.out.println("PIZZA ");
        s1.perpare();
        
        Food s2=new Burgar();
        System.out.println("BURGAR ");
        s2.perpare();
       
        
	}

}
