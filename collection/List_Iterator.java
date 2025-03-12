package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Iterator {

	public static void main(String[] args) {
		List<String> l2 = new ArrayList<String>();
		l2.add("Shiwani");
		l2.add("Neha");
		l2.add("Aman");
		l2.add("Rahul");
		l2.add(1,"Priya");                        
		System.out.println(l2);
		
		Iterator i = l2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
