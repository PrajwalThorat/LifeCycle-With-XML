package org.stackroute.domain.Life_Cycle_WithXml;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void init() {
		System.out.println("Application Started");
	}
	
	public void destroy() {
		System.out.println("Application destroyed");
	}
	
}
