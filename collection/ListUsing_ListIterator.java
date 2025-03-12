package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListUsing_ListIterator {

	public static void main(String[] args) {
		List<String> l2 = new ArrayList<String>();
		l2.add("Shiwani");
		l2.add("Neha");
		l2.add("Aman");
		l2.add("Rahul");
		l2.add(1,"Priya");                        
		System.out.println("List :-" +l2);
		
		System.out.println("Forward Iteraton: ");
		ListIterator<String> i1 = l2.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("Backward Iteraton: ");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}


	}

}
