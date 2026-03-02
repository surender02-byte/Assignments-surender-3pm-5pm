package Assignment2;

//1.A student management system needs to store student name and roll number for every student object,
//while calculation of total marks happens only inside a method.
//👉 Identify and implement instance variables and local variables appropriately
 class Data{
	String studentname;//instance variable
	int studentrollno;//instance variable
	
	public int totalmark(int tamil,int english,int maths){
		
	    int total=(tamil+english+maths);//local variable
	    return total;
		
	}
	public void display(int tamil,int english,int maths) {
		System.out.println("\nStundent Name : "+studentname);
		System.out.println("Stundent Roll Number : "+studentrollno);
		System.out.println("Total Mark : "+totalmark(tamil,english,maths));
	}
	
  }

public class Task1 {

	public static void main(String[] args) {
		
		Data s1=new Data();
		s1.studentname="surender";
		s1.studentrollno=101;
		
		Data s2=new Data();
		s2.studentname="abdul";
		s2.studentrollno=102;
		
        s1.display(54, 50, 60);
        s2.display(64, 60, 60);
	}

}
