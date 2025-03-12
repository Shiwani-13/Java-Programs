package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
	
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the Size of your Array:- ");
	   int array[] = new int[sc.nextInt()];
				
	   System.out.println("Enter the elements of the Array: ");
		for (int i=0;i<array.length;i++)
		{
			array[i] =  sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Input Array :  " + Arrays.toString(array));		
		sc.close();
	}

}
