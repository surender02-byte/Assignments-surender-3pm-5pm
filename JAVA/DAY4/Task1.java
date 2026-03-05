package Assignment4;
//1.Write a program to count the number of digits in a given number using a while loop.
//Example:Input: 45892
//Output: Number of digits = 5
//👉 Do not convert the number to String.
public class Task1 {

	public static void main(String[] args) {
       int input=45892;
       int count=0;
       
       while(input>0){
    	         input=(input/10);
    	         count++;
       }
       System.out.println(count);
	}

}
