package day6;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/*
 *        List(I)
 * *          Vector 1.0(C) -
*               - Legacy class
*               - methods are synchronized
*               - thread safe
*               - insertion order to be maintained
*             	 - duplicates allowed
*               - null values are allowed
*               - Heterogeneous elements are allowed
*               - re-sizable
*               - performance is slower compared to ArrayList
*               - initial capacity 10
*               - incremental capacity - current capacity * 2
*               - 
 */
public class VectorDemo {

	public static void main(String[] args) {
		
		List<String> vector= new Vector();
		vector.add("aa");
		vector.add("bb");
		
		System.out.println(vector.get(0));
		
		// for, foreach, iterator, listIterator & enumaration
		for(String str: vector) {
			System.out.println(str);
		}
		
		Vector<Integer> vector2 = new Vector<>();
		vector2.add(10);
		vector2.add(20);
		vector2.add(40);
		vector2.add(50);
		System.out.println();
		for(Integer el :vector2) {
			System.out.println(el);
		}
		
		vector2.addElement(60);
		System.out.println("Capacity: "+vector2.capacity());
		// Iterator vector
		Enumeration<Integer> en = vector2.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		System.out.println("Element at index 2: "+ vector2.elementAt(2));
 			
	}

}
