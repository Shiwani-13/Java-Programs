package mapconcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FetchingBothKeyValue {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(223344551, "Shiwani");
		m1.put(223344552, "Sunny");
		m1.put(32334455, "Manish");
		m1.put(32334457, "John");
		m1.put(32334456, "Ryan");
		System.out.println(m1);
		
		System.out.println("fetching  both keys & values present in map");
		for(Entry<Integer,String> e : m1.entrySet())
		{
			System.out.println(e);
		}

	}

}

