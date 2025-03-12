package collection;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter any number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int n=0;
		while(num >0)
		{
			n = num%10;
			rev = rev * 10 + n;
			num= num/10;
		}
		
        System.out.println("Reverse of the number is :- " +rev);
        sc.close();
	}

}
