package day6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/*
 *        List(I)
 *          Vector(C)
 * *          Stack(C) - 
*               - LIFO
*               - Sub class of Vector
*               - pop() - removes last inserted element
*               - peek() - it return last inserted element
*               - push() - add elements
*               - Thread safe
 */
public class StackDemo {

	public static void main(String[] args) {
		
		List<Integer> st1= new Stack<>();
		st1.add(100);
		st1.add(200);
		st1.add(300);
		st1.add(400);
		
		ListIterator<Integer> lItr= st1.listIterator();
		while(lItr.hasNext()) {
			System.out.println(lItr.next());
		}
		
		Stack<String> st2 = new Stack<>();
		st2.addElement("xx");
		st2.add("yy");
		Iterator<String> itr = st2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		// Stack specific methods
		// add element at the end
		st2.push("zz");
		System.out.println("After push: "+ st2);
		
		// Get peek element from stack
		System.out.println(st2.peek());//zz
		
		// pop
		st2.pop();
		System.out.println("After pop: "+ st2);
		
		// search element from stack
		System.out.println(st2.search("yy"));
		
			
	}

}
