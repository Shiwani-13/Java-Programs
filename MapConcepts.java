package mapconcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapConcepts {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the map :- ");
		int size = sc.nextInt();
		
		System.out.println("Enter the key and value for the map:- ");
		for(int i=0;i<size;i++)
		{
			m1.put(sc.nextInt(), sc.next());
		}
		
       System.out.println(m1);
       sc.close();
	}

}
