package Assignments15_Map_Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//1.Remove Duplicate Users
//You are given a list of user email IDs from a registration system. 
//Some users registered multiple times.
// Task:
//Write a program to remove duplicates and return unique email IDs.
public class Remove_Duplicate_Users_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>email=new ArrayList<>();
		
		email.add("susu@gmail.com");
		email.add("suszy@gmail.com");
		email.add("susu@gmail.com");
		email.add("c@gmail.com");
		
		Set<String> unique=new HashSet<>(email);
		System.out.println(unique);

	}

}
