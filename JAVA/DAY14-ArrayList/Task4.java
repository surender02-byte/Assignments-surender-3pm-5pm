package Assignments14_ArrayList;

import java.util.ArrayList;

//4.Find Second Largest Element using ArrayList
public class Second_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer>list=new ArrayList<>();
    list.add(0);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    
  
    
    int small=list.get(0);
    int secsmall=list.get(1);
    for(int i=1;i<list.size();i++) {
    	
    	if(small>list.get(i)) {
    		secsmall=small;
    	}
    	else if(secsmall>list.get(i)){
    		secsmall=list.get(i);
    	}
    	
    }System.out.println(secsmall);
	}

}
