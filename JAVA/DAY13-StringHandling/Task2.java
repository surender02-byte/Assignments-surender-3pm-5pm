package Assignments13_String_Handling;
import java.util.*;
//2.Compress the string using character count.
//Input:
//aaabbccccd
//Output
//a3b2c4d1
public class Compress_the_string_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc=new Scanner (System.in);
//System.out.println("enter the input :");
String s1="aabbbccccdd";
//String alpha="abcdefghijklmnopqrstuvwxyz";

int count=1;
char temp=s1.charAt(0);

for(int i=1;i<s1.length();i++) {
	if(temp==s1.charAt(i)) {
		count++;
	}
	else {
		System.out.println(temp+"->"+count);
		temp=s1.charAt(i);
		count=1;
	}
	
}
System.out.println(temp+"->"+count);


	}

}
