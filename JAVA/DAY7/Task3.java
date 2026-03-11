package Assignments7;
//3. Student Grade System
//Create a class Student with:
//studentId
//studentName
//marks
//Requirements:Use a parameterized constructor to assign values.
//Create a method calculateGrade() using conditions:
//marks >= 90 → Grade A
//marks >= 75 → Grade B
//marks >= 50 → Grade C
//otherwise → Fail
//Create two student objects and display their grades.
class Grade{
	int studentId;
	String studentName;
	int marks;
	Grade(int i,String n,int m){
		this.studentId=i;
		this.studentName=n;
		this.marks=m;
	}
	void calculateGrade() {
		if (marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=50) {
			System.out.println("Grade C");
		}
		else  {
			System.out.println("Fail");
		}
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Grade s1=new Grade(01,"susu",89);
     Grade s2=new Grade(02,"susb",99);
     s1.calculateGrade();
     s2.calculateGrade();

     
	}

}
