package Assignments14_ArrayList;
//1.Remove All Occurrences of an Element  using ArrayList
//Input:
//List = [1, 2, 3, 2, 4, 2] 
//Element = 2
//Output:
//[1, 3, 4]
import java.util.*;

public class Remove_Elements_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer> list = new ArrayList<>();

	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(2);
	        list.add(4);
	        list.add(2);

	       
	        System.out.println("Before: " + list);

	        for(int i = 0; i < list.size(); i++) {
	            if (list.get(i) == 2) {
	                list.remove(i);
	               
	            }
	        }

	        System.out.println("After: " + list);
	       
	}

}
