package day4;

/*
 * 
 * Inheritance types - Java supports 3 types
 *  1. Single - Supports
 *  
 *      Person
 *         |
 *      Student 
 *      
 *  2. Multiple - 
 *       Parent1(m1)   |    Parent2 (m1)
 *                   Child
 *  
 *  3. MultiLevel - Support
 *            GrandParent
 *                 |
 *               Parent
 *                 |
 *               Child
 *               
 *  4. Hybrid
 *              GrandParent
 *                    |
 *            Parent1 |   Parent2
 *                    Child
 *  5. Hierarchical - Support
 *                 Parent
 *                   |
 *           Child1  | Child 2
 *  
 *     
 * 
 */

public class InheritanceDemo {

	public static void main(String[] args) {
		// Single Inheritance
		Student std1 = new Student(2002, "Ramesh", 14);
		System.out.println(std1.getRollNo());
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		System.out.println(std1);

		System.out.println();
		System.out.println("P values: ");
		Person p = new Person("Sam", 23);
		System.out.println(p.getName());
		System.out.println(p.getAge());

		System.out.println();
		System.out.println("p1 values: ");

		// Runtime polymorphism
		Person p1 = new Student();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		// Invalid condition
		// Student s2 = new Person();

		System.out.println();
		System.out.println("Employee details: ");
		Employee emp1 = new Employee(1001, "Suresh", 24, 56000, "Admin");
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());

		System.out.println();
		// Multilevel inheritance
		// ref type - child class
		// obj type - child class
		Child child = new Child();
		System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);
		System.out.println(child.m1());
		System.out.println(child.m2());
		System.out.println(child.m3());

		// Runtime polymorphism
		System.out.println();
		Parent child1 = new Child();
		System.out.println(child1.x);
		System.out.println(child1.y);
		System.out.println(child1.m1());
		System.out.println(child1.m2());
		
		// ref type - parent class
		// obj type - parent class
		System.out.println();
		Parent p2 = new Parent();
		System.out.println(p2.y);
		System.out.println(p2.x);
		System.out.println(p2.m1());
		System.out.println(p2.m2());
		
		// Invalid case
		// Child c3 = new Parent();
		
		
		
		

	}

}
