package arrayconcept;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// to accept the values of your array at run time

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of your Array:- ");
		int arr[] = new int[sc.nextInt()];
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value of index:- "+ i);
			 arr[i] =  sc.nextInt();
		}
		sc.close();
	}

}
