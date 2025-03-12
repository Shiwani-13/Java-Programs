package mapconcept;

import java.util.HashMap;
import java.util.Map;

public class FetchingValues {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(223344551, "Shiwani");
		m1.put(223344552, "Sunny");
		m1.put(32334455, "Manish");
		m1.put(32334457, "John");
		m1.put(32334456, "Ryan");
		System.out.println(m1);
		
		System.out.println("fetching all the values present in map");
		for(String s : m1.values())
		{
			System.out.println(s);
		}

	}

}
