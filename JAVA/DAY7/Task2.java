package Assignments7;
//2. Product Price Calculation
//Create a class Product with:
//productId
//productName
//price
//quantity
//Requirements:
//Initialize all variables using a parameterized constructor.
//Create a method calculateTotalPrice() that returns price * quantity.
//In the main method, create two product objects and print the total price.
class Product{
	int productId;
	 String productName;
	double price;
	 double quantity;

     Product(int p,String n,double r,double q){
    	 this.productId=p;
    	 this.productName=n;
    	 this.price=r;
    	 this.quantity=q;
     }
     double  calculateTotalPrice() {
    	      double totalprice;
    	      totalprice=price*quantity;
    	      return totalprice;
     }
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Product s1=new Product(01,"sura",5000,2);
		Product s2=new Product(02,"susu",3000,3);
		
		System.out.println("total price: "+ s1.calculateTotalPrice());
		System.out.println("total price: "+ s2.calculateTotalPrice());
	}

}
