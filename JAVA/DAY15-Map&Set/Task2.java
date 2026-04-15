package Assignments15_Map_Set;
//2.Find Missing Numbers
//Given numbers from 1 to N, some numbers are missing.
//👉 Input:
//N = 10
//arr = [1,2,4,6,7,9]

import java.util.HashSet;
import java.util.Set;

public class Find_Missing_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,4,6,7,9};
	        int N = 10;

	        Set<Integer> set = new HashSet<>();

	        for(int num : arr) {
	            set.add(num);
	        }

	        for(int i = 1; i <= N; i++) {
	            if(!set.contains(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}


