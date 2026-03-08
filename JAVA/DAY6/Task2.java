package Assignment6;
//2.A mobile shop creates a phone object with default values.
//Model → Samsung
//Price → 20000
class Phone{
	String Model;
	int Price ;
	
	Phone(){
	  Model="Samsung";
	  Price=130000;  
	}
	Phone(String M,int P){
		Model=M;
		Price=P; 
	}
	void Display() {
		System.out.println(Model+" "+Price);
	}
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone s1=new Phone();
        Phone s2=new Phone("iqoo",60000);
        s1.Display();
        s2.Display();
	}

}
