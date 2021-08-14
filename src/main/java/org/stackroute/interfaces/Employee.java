package org.stackroute.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean , DisposableBean {
	private String name;
	private int age;
	
	public Employee() {
		
	}
	public Employee(String name, int age) {
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
	public void destroy() throws Exception {
		System.out.println("DEath of Person");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Born the Person");
		
	}

}
