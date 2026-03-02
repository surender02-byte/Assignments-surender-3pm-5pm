package Assignment3;
//Write a Java program to find the largest of three numbers.
public class Task2 {

	public static void main(String[] args) {

     int a=29,b=20,c=30;
     
     if (a>b) {
    	 if(a>c) {
    	 System.out.println("largest no: "+a);
    	 }
    	 else {
    		 System.out.println("largest no: "+c);
    	 }
     }
     else if (b>c) {
    	 System.out.println("largest no: "+b);
     }
     else {
    	 System.out.println("largest no: "+c);
     }

	}

}
