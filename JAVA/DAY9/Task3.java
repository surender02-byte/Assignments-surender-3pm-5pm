package Assignment9;

//3.A smart home system controls multiple devices such as Fan, Light, and AirConditioner. Each device can be turned ON and OFF.
//Question:
//Create an interface SmartDevice with methods:
//turnOn()
//turnOff()
//Create classes:
//Fan
//Light
//AirConditioner
//Each class implements the interface and performs device-specific operations.

interface Smartdevice{
	public void turnOn();
	public void turnOff();
	
}
class Fan implements Smartdevice{
	boolean current1=false;
	public void turnOn() {
		if (current1==false) {
			current1=true;
			System.out.println("fan is ON state");
		}
		else {
			System.out.println("fan is already ON state");
		}
	}
	public void turnOff() {
		if (current1==true) {
			current1=false;
			System.out.println("fan is OFF state");
		}
		else {
			System.out.println("fan is already OFF state");
		}
	}
}

class light implements Smartdevice{
	boolean current1=true;
	public void turnOn() {
		if (current1==false) {
			current1=true;
			System.out.println("light is ON state");
		}
		else {
			System.out.println("light is already ON state");
		}
	}
	public void turnOff() {
		if (current1==true) {
			current1=false;
			System.out.println("light is OFF state");
		}
		else {
			System.out.println("light is already OFF state");
		}
	}
}

class Airconditioner implements Smartdevice{
	boolean current1=false;
	public void turnOn() {
		if (current1==false) {
			current1=true;
			System.out.println("Airconditioner is ON state");
		}
		else {
			System.out.println("Airconditioner is already ON state");
		}
	}
	public void turnOff() {
		if (current1==true) {
			current1=false;
			System.out.println("Airconditioner is OFF state");
		}
		else {
			System.out.println("Airconditioner is already OFF state");
		}
	}
}


public class InterfaceSmartDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Smartdevice s1=new Fan();
        s1.turnOn();
        s1.turnOff();
        
        Smartdevice s2=new light();
        s2.turnOn();
        s2.turnOff();
        
        Smartdevice s3=new Airconditioner();
        s3.turnOn();
        s3.turnOff();
	}

}
