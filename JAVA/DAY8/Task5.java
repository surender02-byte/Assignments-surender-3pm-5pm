package Assignments8;
//5. Transport Fare System (Runtime Polymorphism)
//A travel booking system calculates fare differently for different vehicles.
//Task:
//Create a parent class Transport with a method calculateFare().
//Create child classes Bus, Train, and Taxi.
//Override the method in each class to display different fare calculations.
//Use runtime polymorphism to call the methods.
import java.util.*;
class Transpot{
	
	void calculateFare(double kilometer) {
		System.out.println("travel booking system :"+kilometer*30);
	}
}
class Bus extends Transpot{
	void calculateFare(double kilometer) {
		System.out.println("bus fare :"+kilometer*5);
	}
}
class Train extends Transpot{
	void calculateFare(double kilometer) {
		System.out.println("train fare :"+kilometer*20);
	}
}
class Taxi extends Transpot{
	void calculateFare(double kilometer) {
		System.out.println("taxi fare :"+kilometer*40);
	}
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the kilometer :");
    double kilometer=sc.nextDouble();
    
    Transpot tran=new Transpot();
    tran.calculateFare(kilometer);
    
    Bus tran1=new Bus();
    tran1.calculateFare(kilometer);
    
    Train tran2=new Train();
    tran2.calculateFare(kilometer);
    
    Taxi tran3=new Taxi();
    tran3.calculateFare(kilometer);
    
    
    
	}

}
