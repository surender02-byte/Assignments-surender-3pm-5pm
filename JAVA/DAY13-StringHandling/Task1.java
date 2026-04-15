package Assignments13_String_Handling;
//1.Find the smallest substring in s that contains all characters of t.
//Input
//s = ADOBECODEBANC  
//t = ABC

public class Assignmets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String s = "ADOBECODEBANC";
		        String t="ABC";
		        String smallSub=s;
		        String temp;
		 for (int i=0;i<s.length();i++) {
			 for(int j=i+t.length();j<=s.length();j++) {
				 temp=s.substring(i, j);
		//		 check if the value is true
				 int count=0;
				 for(int k=0;k<t.length();k++) {
					 for(int l=0;l<temp.length();l++) {
						 if(t.charAt(k)==temp.charAt(l)) {
							 count++;
							 break;
						 }
						 
					 }
				 }
				 if(count==t.length())
					 if(smallSub.length() > temp.length()) {
						 smallSub=temp;
					 }
					 
				 
				 
				 
			 }
		 }
		System.out.println(smallSub);
		    }
		}