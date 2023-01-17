package day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 *  Map(I) - is not part of Collection
 *   - if you want to store values in the form of 'key' & 'value' pairs
 *   - duplicate keys are not allowed
 *   - duplicate values allowed
 *   - null keys allowed, only once
 *   - null values allowed 
 *  
 *   
 *   Map(I) - SortedMap(I)
 *              - TreeMap(C)
 *                  - insert entries in sorting order
 *          - HashMap(C)
 *              - Won't maintain insertion order
 *          - LinkedHashMap(C)
 *                  - Insertion order maintained 
 *          - HashTable(C) -1.0v - legacy class
 *                         - Thread safe
 *                         - methods are synchronized
 *                         - doesn't allow null key & value
 *                         - performance low
 */
public class MapDemo {

	public static void main(String[] args) {
		
		/*
		 * Insertion order won't maintain
		 * null keys - allowed
		 * multiple null keys are not allowed
		 */
		//HashMap hm = new HashMap();
		Map<String, Integer> hm = new HashMap<>();
		
		// add
		hm.put("Ram", 90);
		hm.put("Sam", 85);
		hm.put("Raj", 95);
		hm.put("Sonu", 75);
		hm.put("Ram", 95);
		hm.put(null, 100);
		hm.put(null, 12);
		hm.put("Sachin", null);
		hm.put("Kumar", null);
		
		// Read
		System.out.println(hm.get("Ram")); //  95
		System.out.println(hm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		System.out.println(hm.size()); // 4
		// Get all values present in hashmap
		System.out.println(hm.values()); //[75, 95, 85, 95]
		
		// Iterate
		// convert map to set
		Set<Entry<String, Integer>> es= hm.entrySet();
		
		Iterator itr = es.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// Get all keys
		Set<String> ks= hm.keySet();
		for(String key:ks) {
			System.out.println(key);
		}
		
		System.out.println(hm.containsKey("Raj"));// true
		System.out.println(hm.containsValue(90)); // true
		
		// Remove
		System.out.println("Before Remove: "+hm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		System.out.println(hm.remove("Ram", 78)); // false 
		System.out.println("After Remove: "+hm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		
		hm.remove("Ram");
		System.out.println(hm); //{Sonu=75, Raj=95, Sam=85}
		
		// update
		hm.replace("Sam", 98);
		System.out.println(hm); //{Sonu=75, Raj=95, Sam=98}
		hm.replace("Sonu", 65, 80);
		System.out.println(hm);//{Sonu=75, Raj=95, Sam=98}
		
		hm.replace("Sonu", 75, 80);
		System.out.println(hm); //{Sonu=80, Raj=95, Sam=98}
		
		
		
		// LinkedHashMap
		Map<String, Integer> lhm = new LinkedHashMap<>();
		
		// add
		lhm.put("Ram", 90);
		lhm.put("Sam", 85);
		lhm.put("Raj", 95);
		lhm.put("Sonu", 75);
		lhm.put("Ram", 95);
		lhm.put(null, 100);
		lhm.put(null, 12);
		lhm.put("Sachin", null);
		lhm.put("Kumar", null);
		
		System.out.println("#################");
		System.out.println("LinkedHashMap");
		System.out.println();
		System.out.println(lhm);
		
		// Read
		System.out.println(lhm.get("Ram")); //  95
		System.out.println(lhm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		System.out.println(lhm.size()); // 4
		// Get all values present in hashmap
		System.out.println(lhm.values()); //[75, 95, 85, 95]
		
		// Iterate
		// convert Map to Set
		Set<Entry<String, Integer>> es1= lhm.entrySet();
		
		System.out.println();
		System.out.println("iterate using iterator");
		Iterator itr1 = es1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println();
		System.out.println("iterate using 'for' loop");
		for(Map.Entry<String,Integer> el :es1) {
			System.out.println(el);
		}
		
				
		System.out.println();
		// Get all keys
		Set<String> lks= lhm.keySet();
		for(String key:lks) {
			System.out.println(key);
		}
		
		System.out.println(lhm.containsKey("Raj"));// true
		System.out.println(lhm.containsValue(90)); // true
		
		// Remove
		System.out.println("Before Remove: "+lhm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		System.out.println(lhm.remove("Ram", 78)); // false 
		System.out.println("After Remove: "+lhm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		
		lhm.remove("Ram");
		System.out.println(lhm); //{Sonu=75, Raj=95, Sam=85}
		
		// update
		lhm.replace("Sam", 98);
		System.out.println(lhm); //{Sonu=75, Raj=95, Sam=98}
		lhm.replace("Sonu", 65, 80);
		System.out.println(lhm);//{Sonu=75, Raj=95, Sam=98}
		
		lhm.replace("Sonu", 75, 80);
		System.out.println(lhm); //{Sonu=80, Raj=95, Sam=98}
		
		
		
		
		// TreeMap
		/*
		 
		 * insertion order - won't maintain
		 * store elements in sorting order
		 * duplicate keys - won't allowed
		 * duplicate values - allowed
		 * null keys - not allowed
		 * null values - allowed
		 */
		
		// HashTable
		// Map<String, Integer> ht = new HashTable<>();
		
		// Problem
		// Count the occurrences of each character in a given String using HashMap.
		// String str = "Contrary to popular belief, Lorem Ipsum is not simply random text."
		
		
		
		Map<String, Integer> tm = new TreeMap<>();
		
		// add
		tm.put("Sam", 85);
		tm.put("Raj", 95);
		tm.put("Sonu", 75);
		tm.put("Ram", 95);
		//tm.put(null, 100); // NullPointerException
		// tm.put(null, 12); // NullPointerException
		tm.put("Sachin", null);
		tm.put("Kumar", null);
		
		System.out.println("###########");
		System.out.println("TreeMap");
		System.out.println("###########");
		System.out.println();
		System.out.println(tm);
		
		// Read
		System.out.println(tm.get("Ram")); //  95
		System.out.println(tm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		System.out.println(tm.size()); // 4
		// Get all values present in hashmap
		System.out.println(tm.values()); //[75, 95, 85, 95]
		
		// Iterate
		// convert Map to Set
		Set<Entry<String, Integer>> es2= tm.entrySet();
		
		System.out.println();
		System.out.println("iterate using iterator");
		Iterator itr2 = es2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println();
		System.out.println("iterate using 'for' loop");
		for(Map.Entry<String,Integer> el :es2) {
			System.out.println(el);
		}
		
				
		System.out.println();
		// Get all keys
		Set<String> tks= tm.keySet();
		for(String key:tks) {
			System.out.println(key);
		}
		
		System.out.println(tm.containsKey("Raj"));// true
		System.out.println(tm.containsValue(90)); // true
		
		// Remove
		System.out.println("Before Remove: "+lhm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		System.out.println(tm.remove("Ram", 78)); // false 
		System.out.println("After Remove: "+lhm); // {Sonu=75, Raj=95, Sam=85, Ram=95}
		
		tm.remove("Ram");
		System.out.println(tm); //{Sonu=75, Raj=95, Sam=85}
		
		// update
		tm.replace("Sam", 98);
		System.out.println(tm); //{Sonu=75, Raj=95, Sam=98}
		tm.replace("Sonu", 65, 80);
		System.out.println(tm);//{Sonu=75, Raj=95, Sam=98}
		
		tm.replace("Sonu", 75, 80);
		System.out.println(tm); //{Sonu=80, Raj=95, Sam=98}
		


	}

}
