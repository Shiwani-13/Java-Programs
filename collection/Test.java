package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Test {
public static void main(String[] args) {
	TreeSet l1 = new TreeSet();
	//PriorityQueue l1 = new PriorityQueue();
	//LinkedList l1 = new LinkedList();
	l1.add(67);
	l1.add(20);
	l1.add(35);
	//l1.add(90.09);
	l1.add(70);
	//l1.add("Shiwani");
	l1.add(20);
	//l1.add(null);
	//l1.add(null);
	//Collections.sort((List<Integer>) l1);
	System.out.println(l1);
	Iterator i = l1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
