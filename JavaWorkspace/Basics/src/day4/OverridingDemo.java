package day4;
/*
 *   - Implemented between different classes
 *    - method name should be same as parent
 *    - no of input args, type and order should be same
 *    - return type same - 1.4v
 *    - return type can be covariant type is allowed 
 *      Object - parent
 *      String | StringBuffer | StringBuilder | Integer | - Child class
 *      static & final methods cann't be overridden
 *      method visibility cann't be reduced using access modifiers. 
 */
public class OverridingDemo {

	public static void main(String[] args) {
//		Child c = new Child();
//		
//		c.display();

		
		Parent c1 = new Child();
		c1.display(); // "Child class"
		
		Employee p = new Employee();
		System.out.println(p.getPerson());// day4.Person@15db9742
		
		Person p1 = new Employee();
		System.out.println(p1.getPerson()); // day4.Person@6d06d69c
		
		
		
		
	}

}
