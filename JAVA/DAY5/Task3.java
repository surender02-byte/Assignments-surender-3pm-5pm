package Assignment5;
//3.Create a class Student:
//Variables: rollNo, name, mark1, mark2, mark3
//Method to calculate:
//Total
//Average
//Grade (A, B, C, Fail)
//Condition:
//Average ≥ 80 → A
//Average ≥ 60 → B
//Average ≥ 40 → C
//Else → Fail
//Create 5 student objects and display result.

 class Student{
	int rollno;
	String name;
	int marks1;
	int marks2;
	int marks3;
    
	
    public void total(int marks1,int marks2,int marks3) {
    	
    	    System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        
	 int Total=marks1+marks2+marks3;
	    System.out.println("Total : "+Total);
    
	 int average=((Total)/3);
	    System.out.println("Average: "+average);
	 
	 if (average>=80) {System.out.println("Grade A: "+average); }
	 else if (average>=60) {System.out.println("Grade B: "+average);}
	 else if(average>=40) {System.out.println("Grade C: "+average);}
	 else{System.out.println("FAIL");}
	 System.out.println("------------------------------");
    }
 }
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student();
    s1.rollno=101;
    s1.name="sura";
    
    Student s2=new Student();
    s2.rollno=102;
    s2.name="abdul";
    
    Student s3=new Student();
    s3.rollno=103;
    s3.name="deeps";
    
    Student s4=new Student();
    s4.rollno=104;
    s4.name="vjiay";
    
    Student s5=new Student();
    s5.rollno=105;
    s5.name="ragu";
   
    s1.total(99,99,99);
    s2.total(80, 90, 90);
    s3.total(98, 34, 10);
    s4.total(20, 37, 30);
    s5.total(19,59 , 60);
    
    
	}

}
