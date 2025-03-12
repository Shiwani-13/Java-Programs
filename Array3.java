// check if 2 arrays are equals to each other at run time
package arrayconcept;
import java.util.Arrays;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the first Array:- ");
		int arr1[] = new int[sc.nextInt()];
		
		System.out.println("Enter the elements of first array:- ");
		for (int i=0;i<arr1.length;i++)
		{
			 arr1[i] =  sc.nextInt();
		}

		System.out.println("Enter the Size of the second Array:- ");
		int arr2[] = new int[sc.nextInt()];
		
		System.out.println("Enter the elements of second array:- ");
		for (int i=0;i<arr2.length;i++)
		{
			 arr2[i] =  sc.nextInt();
		}
		boolean b = Arrays.equals(arr1, arr2);
		if(b==true)
			System.out.println("Both arrays are equal to each other");
		else
			System.out.println("Both arrays are not equal to each other");
		sc.close();

	}

}

