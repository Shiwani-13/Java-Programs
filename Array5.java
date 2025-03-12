//arrayindexoutofbounds expection with a try catch

package arrayconcept;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		try
		{
		int array[]= new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		//array[3]=40;
       // array[4]=40;
		
		System.out.println(Arrays.toString(array));
		
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter array elements within the size");
		}
		
		
	}

}
