package org.stackroute.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		
		Student stud=(Student)context.getBean("student");
		System.out.println(stud);
		context.registerShutdownHook();
	}

}
