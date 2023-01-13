package day4;

public class Person {
	
	private String name;
	private int age;
	// Constuctor 
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// Getter & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Person getPerson() {
		return new Person();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
