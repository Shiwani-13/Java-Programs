package arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class CopyReverseArray {

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
			for(int i= 0,j =arr1.length-1;i<arr1.length;i++, j--)
			{
				arr2[j]= arr1[i];		
			}
			System.out.println("Input Array:    "+Arrays.toString(arr1));
			System.out.println("Reversed Array: "+Arrays.toString(arr2));
			sc.close();

	}

}
