package Assignments11;
//3.Design an abstract class Transport with an abstract method bookTicket().
//Implement subclasses Bus and Train.

abstract class Transport{
	abstract void bookTicket();
}

class Bus extends Transport{
	void bookTicket() {
		System.out.println("yours bus ticket has booked");
	}
}

class Train extends Transport{
	void bookTicket() {
		System.out.println("yours Train ticket has booked");
	}
	
}
public class Transport_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Transport s1=new Bus();
        System.out.println("bus");
        s1.bookTicket();
        
        Transport s2=new Train();
        System.out.println("Train");
        s2.bookTicket();
        
        
	}

}
