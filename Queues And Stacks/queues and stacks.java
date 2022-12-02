import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0; i<s.length(); i++)
        str=s.charAt(i)+str;
        if(str.equals(s))
        System.out.println("The word, "+s+", is a palindrome.");
        else
        System.out.println("The word, "+s+", is not a palindrome.");
    }
}
