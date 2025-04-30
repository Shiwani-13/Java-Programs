package stringclass;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:- ");
		String input1 = sc.next();
		System.out.println("Enter the second String:- ");
		String input2 = sc.next();
	
		if(input1.length() != input2.length())
		{
			System.out.println("Given strings are not Anagram");
		}
		else
		{
			char c1[]= input1.toCharArray();
			char c2[]= input2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
		   boolean b = Arrays.equals(c1, c2);
			 if(b== true)
				 System.out.println("Given strings are Anagram");
			 else
				 System.out.println("Given strings are not Anagram");
		}
      sc.close();
	}

}
