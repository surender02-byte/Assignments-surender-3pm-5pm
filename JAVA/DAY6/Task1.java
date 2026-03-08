package Assignment6;
//1.A company system creates an employee record.
//If no details are given, the system should automatically assign:
//Employee ID → 100
//Employee Name → "Not Assigned"
class EmployeeRecords{
     int EmployeeID;
     String EmployeeName;

EmployeeRecords(){
	  EmployeeID=100;
      EmployeeName="Not Assigned";
}
EmployeeRecords(int i,String n){
	 EmployeeID=i;
     EmployeeName=n;

}
void Display() {
	System.out.println(EmployeeID+" "+EmployeeName);
}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRecords s1= new EmployeeRecords();
		EmployeeRecords s2= new EmployeeRecords(102,"Suszy");
		s1.Display();
		s2.Display();
		
		
			 
	}

}
