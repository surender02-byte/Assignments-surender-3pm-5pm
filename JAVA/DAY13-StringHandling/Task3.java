package Assignments13_String_Handling;

public class Reverse_the_given_string_3 {

    public static void main(String[] args) {

        String s = "aabbccccd";
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}