package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListConcept {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(30);
		l1.add(40.50);
		l1.add(true);
		l1.add("Shiwani");
		l1.add('F');
		l1.add(null);
		l1.add(null);
		System.out.println("List :- " +l1);
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Shiwani");
		l2.add("Neha");
		l2.add("Aman");
		l2.add("Rahul");
		
		l2.add(1,"Priya");                        //adding value with index
		System.out.println(l2);
		l2.addAll(0,l1);                          //adding collection with index
		System.out.println(l2);
		
		 boolean b = l2.isEmpty();                                               //isEmpty()Method
	    System.out.println("checking set is empty: " +b);
	    System.out.println("List of Integer before removing: " +l2);
	        
	     l2.remove("Aman");                                                          //remove() method
	     System.out.println("List of Integer after removing Aman: " +l2);
	
		

	}

}
