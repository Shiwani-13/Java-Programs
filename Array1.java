package arrayconcept;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// basic concepts of Array
		
		int array[] = new int[3];
		array[0]= 50;
		array[1]= 60;
		array[2]= 70;
		
		System.out.println(Arrays.toString(array));
		for(int i = 0; i< array.length; i++)
			System.out.println(array[i]);

	}

}
