package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_iteration {

	public static void main(String[] args) {
		Collection c =new ArrayList();
        c.add(20);
        c.add(46);
        c.add(60.57);
        c.add("Shiwani");
        c.add('A');
        c.add(true);
        System.out.println("Collection:- " +c);
        Iterator  i = c.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
        
	}

}
