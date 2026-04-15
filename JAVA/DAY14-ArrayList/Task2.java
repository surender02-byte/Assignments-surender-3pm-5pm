package Assignments14_ArrayList;
import java.util.ArrayList;
//2.Find Frequency of Each Element  using ArrayList
//Input:
//[1, 2, 2, 3, 3, 3]
//Output:
//1 → 1  
//2 → 2  
//3 → 3
public class Frequency_of_Each_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<String> outList=new ArrayList<String>();
		
	
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		
		list.sort(null);
		System.out.println(list);
		
		int count=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==1) {
				count++;
			}
			else if(list.get(i)==2) {
				count1++;
			}
			else if(list.get(i)==3) {
				count2++;
			}
		}
		
		outList.add(list.get(0)+"--> "+count);
		outList.add("2--> "+count1);
		outList.add("3--> "+count2);
		
		System.out.println(outList);
	
	}

}
