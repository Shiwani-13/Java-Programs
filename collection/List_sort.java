package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_sort {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(60);
		l1.add(29);
		l1.add(56);
		l1.add(32);
		l1.add(90);
		l1.add(20);
		 System.out.println("Original List :- " +l1);
		 
		Collections.sort(l1);
	  System.out.println("Sorted List :-" +l1);

	}

}
