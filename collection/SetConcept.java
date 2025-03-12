package collection;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		
		Set<Object> s1 = new HashSet<Object> ();
		s1.add(30);
		s1.add(40.50);
		s1.add(true);
		s1.add("Shiwani");
		s1.add('F');
		s1.add(null);
		s1.add(null);
		s1.add(30);
		System.out.println(s1);
		
		Set<Object>  s2 = new HashSet<Object> ();
		s2.add(90);
		s2.add(150);
		s2.addAll(s1);
		System.out.println(s2);
		
		 boolean b = s1.isEmpty();                                               //isEmpty()Method
	    System.out.println("checking set is empty: " +b);
	    System.out.println("Set of Integer before removing: " +s2);
	        
	     s2.remove(150);                                                          //remove() method
	     System.out.println("Set of Integer after removing: " +s1);
	}

}
