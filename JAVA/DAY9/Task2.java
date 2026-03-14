package Assignment9;

//2.A transportation company develops different types of vehicles like Car, Bike, and Truck.
//Every vehicle must have the ability to start the engine and stop the engine, but the implementation differs for each vehicle.
//Question:
//Create an interface Vehicle with methods:
//startEngine()
//stopEngine()
//Implement the interface in the classes:
//Car
//Bike
//Truck
//Demonstrate polymorphism using the interface reference.
 
interface Vehicle{
  public void startEngine();
  public void stopEngine();
  
}
class Car implements Vehicle{
	boolean engine =false;
	public void startEngine() {
		if(engine==false) {
			engine=true;
			System.out.println("car engine is started");
		}
		else {
		System.out.println("car engine is already started");
	}} 
	
	public void stopEngine() {
		if(engine==true) {
			engine=false;
			System.out.println("car engine is stoped");
		}else {
		System.out.println("car engine is already stop");
	}
		}
	
}

class Bike implements Vehicle{
	
	boolean engine=false;
	
	public void startEngine() {
		if (engine==false) {
			engine=true;
			System.out.println("bike engine is started");
		}else 
		{
		System.out.println("bike engine is already started");
	}
		}
	
	public void stopEngine() {
		if(engine==true) {
			engine=false;
			System.out.println("bike engine is stop");
		}else {
		System.out.println("bike engine is already stop");
	}
}
}
class Truck implements Vehicle{
	
    boolean engine=false;

	public void startEngine() {
		if (engine==false) {
			engine=true;
			System.out.println("truck engine is started");
		}
		else {
		System.out.println("truck engine is already started");
	}}
	public void stopEngine() {
		if(engine==true) {
			engine =false;
			System.out.println("truck engine is stop");
		}else {
			System.out.println("truck engine is already stop");
		}
		
	}
}

public class InterfaceVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vehicle s1=new Car();
       s1.startEngine();
       s1.stopEngine();
       
       Vehicle s2=new Bike();
       s2.startEngine();
       s2.stopEngine();
       
       Vehicle s3=new Truck();
       s3.startEngine();
       s3.stopEngine();
	}

}

