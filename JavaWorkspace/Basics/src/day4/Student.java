package day4;

public class Student extends Person{
	
	private int rollNo;
//	private String name;
//	private int age;
	
	
	// Constructor
	public Student() {}
	
	public Student(int rollNo, String name, int age) {
		super(name, age);
		this.rollNo = rollNo;
	}
	
	
	// Getters & setters
	// <accessModifiers> <returnType> <methodName>() {// body}
	// Setter Methods
	void setRollNo(int id) {
		this.rollNo= id;
	}

//	void setName(String name) {
//		this.name=name;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	// Getter Methods
	int getRollNo() {
		return this.rollNo;
	}
//	String getName() {
//		return this.name;
//	}
//	public int getAge() {
//		return age;
//	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + getName() + ", Age=" + getAge() + "]";
	}
	
	
	// Overide toString method defined in Object
	

}
