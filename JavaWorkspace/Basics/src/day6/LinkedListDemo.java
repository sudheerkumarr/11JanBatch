package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *   List(I)
 *     LinkedList(C) - 
*             - insertion order to be maintained
*             - duplicates allowed
*             - null values are allowed
*             - Heterogeneous elements are allowed
*             - Based on Doubly linked list (data structure)
*             - re-sizable
*             - methods are not synchronized
*             - not thread safe
*             - can be accessed using index
*             - initial capacity- No default initial capcity
*             - incremental capacity - Not applicable
*             - frequent operation insertion and deletion
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("aa");
		linkedList.add("bb");
		linkedList.add("dd");
		linkedList.add("cc");
		linkedList.add("aa");
		linkedList.add(null);
		
		System.out.println(linkedList);
		
		System.out.println(linkedList.get(3));
		System.out.println(linkedList.size());
		System.out.println(linkedList.contains("ee"));
		linkedList.set(1, "bbbb");
		System.out.println("After update: " + linkedList);
		System.out.println(linkedList.remove(4));
		System.out.println("After remove: "+ linkedList);
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(10);
		ll2.add(30);
		System.out.println(ll2);
		//ll2.addFirst(20);
		//System.out.println(ll2);
		
		System.out.println(ll2.lastIndexOf(30));
		
		System.out.println();
		// for, foreach, iterator, ListIterator
		for(Integer el :ll2) {
			System.out.println(el);
		}
		
		
		
	}

}
