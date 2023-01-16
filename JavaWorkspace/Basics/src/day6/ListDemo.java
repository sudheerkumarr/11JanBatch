package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
* Iterable(I)
*  Collection(I)
*   List(I)
*     ArrayList(C)
*             - insertion order to be maintained
*             - duplicates allowed
*             - null values are allowed
*             - Heterogeneous elements are allowed
*             - Based on Dynamic array
*             - re-sizable
*             - methods are not synchronized
*             - not thread safe
*             - can be accessed using index
*             - initial capacity - 10
*             - incremental capacity - (current capacity * 3/2)+1
*             - frequent operation retrieval
*             - able to access elements randomly

*              
*   SET(I)
*   Queue(I)
*   Map(I)
*   Comparator/Comparable - sort
*/
public class ListDemo {

	public static void main(String[] args) {
		List arrList = new ArrayList();
		//ArrayList arrList = new ArrayList();
		
		arrList.add(10); // Integer
		arrList.add("Hello"); // String
		arrList.add('c'); // Character
		arrList.add(false); // Boolean
		arrList.add(false); // Boolean
		arrList.add(null); 
		arrList.add(null);
		
		for(int i=0; i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		// for(Integer el :arrList)
		
		System.out.println();
		// Iterator - use in List, Set, Map
		// supports reading elements  in only forward direction
		Iterator itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// ListIterator - Supports List alone
		// Read elements in forward direction
		ListIterator listItr = arrList.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println();
		// Read elements in backward direction
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		System.out.println();
		System.out.println(arrList.contains(10)); // true
		System.out.println(arrList.isEmpty()); // false
		System.out.println(arrList.indexOf('c')); // 2
		
		System.out.println("Before Remove: " + arrList);
		arrList.remove(0);
		arrList.remove(false);
		System.out.println("After remove: "+arrList);
		
		List arrList2 = new ArrayList();
		arrList2.add("Red");
		arrList2.add("Green");
		
		System.out.println();
		System.out.println("Before Add: " + arrList);
		arrList.addAll(arrList2);
		System.out.println("After Add: " + arrList);
		
		arrList.set(0, "Hello World!");
		System.out.println(arrList);
		System.out.println(arrList.subList(1, 3));
		//arrList.clear();
		
		// Generics
		// List<Integer> arrList3 = new ArrayList<>();
		List<String> arrList4 = new ArrayList<>();
		arrList4.add("aa");
		arrList4.add("bb");
		arrList4.add("cc");
		
		System.out.println();
		// for, foreach, iterator, listIterator
		for(String str :arrList4) {
			System.out.println(str);
		}
		
		List<Integer> arrList5 = new ArrayList<>();
		arrList5.add(10);
		arrList5.add(20);
		arrList5.add(30);
		
		System.out.println();
		for(Integer el :arrList5) {
			System.out.println(el);
		}
		
	}

}
