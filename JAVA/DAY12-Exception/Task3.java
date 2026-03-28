package Assignments12;
//3.Implement a student grading system where:
//Invalid marks (<0 or >100) → exception
//Null student name → exception
//Use finally to print “Process Completed”

import java.util.Scanner;

class GradingException extends Exception{

	public GradingException(String message) {
		super(message);
	}
	
}

class StudentGrading{
	String name;
	int mark;
	
	public StudentGrading(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}
	
	void GradingSystem()throws GradingException{
		
		 String error="";
		if(name==null || name.isEmpty()) {
          error +="Name is invalid\n";
		}

		if (0 > mark || mark > 100) {
	      error +="Invalid marks\n";
		}
		
		if(!error.isEmpty()) {
	        throw new GradingException(error);
	    }
		System.out.println("Valid input");
	}
}



public class Exception_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String na=sc.nextLine();
		System.out.println("Enter the mark : ");
		int mk=sc.nextInt();
		
		
		StudentGrading s1=new StudentGrading(na,mk);
		
		try {
			s1.GradingSystem();
		}
		catch(GradingException e) {
			System.out.println(e.getMessage());

		}
		finally{
			System.out.println("Process Completed");

		}
	}

}
