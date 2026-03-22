package Assignments11;
//1.Design an abstract class Appliance with an abstract method turnOn() and turnOff().
//Implement the methods in Fan and WashingMachine classes.

abstract class Appliance{
	abstract void turnOn();
	abstract void turnOff();
	
}
class Fan extends Appliance{
	void turnOn() {
		System.out.println("your fan is turn on");	
		}
	void turnOff() {
		System.out.println("your fan is turn Off");
	}
}

class WashingMachine extends Appliance{
	void turnOn() {
		System.out.println("your fan is turn on");	
		}
	void turnOff() {
		System.out.println("your fan is turn Off");
	}
}

public class Appliance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FAN");
		Appliance s1=new Fan();
        s1.turnOn();
        s1.turnOff();
        
        System.out.println("WASHINGMACHINE");
        Appliance s2=new WashingMachine();
        s2.turnOn();
        s2.turnOff();
        
	}

}
