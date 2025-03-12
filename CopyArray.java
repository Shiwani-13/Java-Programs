package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the Size of your Array:- ");
	    int arr1[] = new int[sc.nextInt()];
		
	    System.out.println("Enter the elements of the Array: ");
		for (int i=0;i<arr1.length;i++)
		{
			 arr1[i] =  sc.nextInt();
		}
		
		int arr2[] = new int[arr1.length];	
		for(int i= 0;i<arr1.length;i++)
		{
			arr2[i]= arr1[i];		
		}
		System.out.println("Input Array: "+Arrays.toString(arr1));
		System.out.println("Coppied Array: "+Arrays.toString(arr2));
		sc.close();

	}

}
