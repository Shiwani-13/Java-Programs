package mapconcept;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(223344551, "Shiwani");
		m1.put(223344552, "Sunny");
		System.out.println(m1);
		
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(32334455, "Manish");
		m2.put(32334456, "Ryan");
		m2.put(32334457, "John");
		m2.putAll(m1);                                                         //putAll() - Add one map to another
		System.out.println(m2);
		
		m2.remove(32334456);                                                            //remove() -remove by using key
		m2.remove(32334457, "John");                                                    //remove() -remove by using key and value
		System.out.println("Remove Ryan and John:-"+m2);
		
		m2.replace(32334455, "Sneha");                                                            //replace()- replace with key value
		System.out.println("Replace Manish with Sneha: " +m2);                                   
		
		m2.replace(32334455,"Sneha","Geeta");                                                    //replace()- replace with old value with new value
		System.out.println("Replace old with new value: " +m2);
		
		m2.clear();                                                            //clear()
		System.out.println("clear key and value from map"+m2);
		
		boolean b = m2.isEmpty();                                                            //isEmpty()
		System.out.println("Checking Map is empty or not:-"+b);
		
		

	}

}
