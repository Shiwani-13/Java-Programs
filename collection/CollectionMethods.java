package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		Collection <Integer> c1 = new ArrayList<Integer>()  ;
        c1.add(25);
        c1.add(45);
        c1.add(140);
        c1.add(95);
        boolean b = c1.isEmpty();                                               //isEmpty()Method
        System.out.println("checking List is empty: " +b);
        System.out.println("List of Integer before removing: " +c1);
        
        c1.remove(45);                                                          //remove() method
        System.out.println("List of Integer after removing: " +c1);
        
		Collection <Integer> c2 = new ArrayList<Integer>()  ;
        c2.add(35);
        c2.add(40);
        c2.addAll(c1);
        System.out.println("List of second Integer before removing: " +c2);
        c2.removeAll(c1);                                                         //removeAll() method
        System.out.println("List of second Integer after removing c1: " +c2);
        
         boolean b2 = c2.contains(c1);                                             //contains() method
         System.out.println(b2);
        }

}
