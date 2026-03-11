package Assignments8;

//2. Shape Area Calculation (Compile-Time Polymorphism)
//A Geometry Calculator should calculate the area of different shapes.
//Task:
//Create a class ShapeCalculator.
//Create multiple area() methods using method overloading for:
//Square (side)
//Rectangle (length, width)
//Circle (radius)
//Call all methods from the main() method.

class ShapeCalculator{
	void area(int s) {
		System.out.println("area value of square: "+s*s);
	}
	void area(int l,int w) {
		int lenght=l;
		int width=w;
		System.out.println("area value of square: "+lenght*width);
	}
	void area(double r) {
		System.out.println("area value of square: "+(3.14*r*r));
	}
	
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCalculator s1=new ShapeCalculator();
		s1.area(3);
		s1.area(4, 8);
		s1.area(4.0);
	}

}
