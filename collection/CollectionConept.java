package collection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionConept {

	public static void main(String[] args) {
 
		//ArrayList c1 = new ArrayList();
		 Collection <Integer> c1 = new ArrayList<Integer>()  ;
	        c1.add(25);
	        c1.add(45);
	        c1.add(45);
	        System.out.println("List of Integer: " +c1);
	        
	     Collection <Double> c2 = new ArrayList<Double>()  ;
	        c2.add(65.89);
	        c2.add(90.0);
	        System.out.println("List of Double: " +c2);
	        
        Collection <String> c3 = new ArrayList<String>()  ;
           c3.add("Shiwani");
           c3.add("Priya");
           c3.add(null);
           c3.add(null);
           System.out.println("List of String: " +c3);
         
       Collection <Character> c4 = new ArrayList<Character>()  ;
           c4.add('A');
           c4.add('B');
           c4.add('C');
           System.out.println("List of Character: " +c4);

	}

}
