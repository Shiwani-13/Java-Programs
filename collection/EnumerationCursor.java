package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add(20);
		v.add(90.6);
		v.add(90.6);
		v.add(null);
		v.addElement("Shiwani");
		v.addFirst(30);
		v.addLast('F');
		System.out.println(v);
		
		Enumeration<Object> e = v.elements();
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		//System.out.println(e.hashCode());
	}

}
