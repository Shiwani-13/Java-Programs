package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iteration {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String> ();
		s1.add("House");
		s1.add("Office");
		s1.add("Park");
		s1.add("Market");
		s1.add("Temple");
		System.out.println(s1);
	
		
		 Iterator  i = s1.iterator();
	        while(i.hasNext())
	        {
	        	System.out.println(i.next());
	        }

	}

}
