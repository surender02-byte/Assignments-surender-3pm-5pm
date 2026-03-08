package Assignment6;
//3.A library system automatically creates a member profile when a new user registers.
//Member ID → 501
//Membership Type → Regular
class Memberprofile{
	int MemberID;
    	String MemberShip;
	static int count=501;
	Memberprofile(){
		MemberID=count;
		MemberShip="Regular";
		count++;
	}
	Memberprofile(String Ship){
		MemberID=count;
		MemberShip=Ship;
		count++;
	}
	Memberprofile(int i,String s){
		MemberID=i;
		MemberShip=s;
	}
	void Display() {
		System.out.println("\nMember ID : "+ MemberID+"\nMember Ship : "+MemberShip);
	}
	
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberprofile s1=new Memberprofile();
		s1.Display();
		Memberprofile s2=new Memberprofile();
		s2.Display();
		Memberprofile s3=new Memberprofile("permium");
		s3.Display();
		Memberprofile s4=new Memberprofile(505,"regular");
		s4.Display();
		
	}

}
