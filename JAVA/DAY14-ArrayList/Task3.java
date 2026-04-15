package Assignments14_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
//3.Rotate ArrayList to Right by K Positions
//Input:
//List = [1, 2, 3, 4, 5]  
//K = 2
//Output:
//[4, 5, 1, 2, 3]
public class Rotate_ArrayList_to_Right_by_K_Positions_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the k= ");
		int k=sc.nextInt();
	
		ArrayList<Integer>List=new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		
		List.sort(null);
		System.out.println(List);
		
		int size=List.size();
		int temp;
		for (int i=0;i<k;i++) {
			temp=List.get(size-1);
			List.remove(size-1);
			List.add(0, temp);
		}
		System.out.println(List);
	}

}
