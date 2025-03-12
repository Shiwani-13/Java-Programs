package mapconcept;

import java.util.HashMap;
import java.util.Map;
public class MapMethods2 {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(223344551, "Shiwani");
		m1.put(223344552, "Sunny");
		m1.put(32334455, "Manish");
		m1.put(32334457, "John");
		System.out.println(m1);
		m1.putIfAbsent(223344558, "Neha");
		System.out.println("Entry added by using putIfAbsent:- " +m1);                   //putIfAbsent()
		boolean b1=m1.containsKey(223344551);                                            //containsKey()
	    System.out.println("Checking key is available in map or not - " +b1);
	   
	   boolean b2 = m1.containsValue("Sunny");                                            //containsValue()
	   System.out.println("Checking Value is available in map or not - " +b2);
	   
	   Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(223344551, "Shiwani");
		m2.put(223344552, "Sunny");
		m2.put(32334455, "Manish");
		m2.put(32334457, "John");
		boolean b3= m2.equals(m1);                                                       //equals()
		System.out.println("Checking both maps are equal or not - " +b3);
		System.out.println("get value - "+m2.get(223344551));                                            //get()
	

	}

}
