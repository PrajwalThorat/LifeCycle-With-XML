package org.stackroute.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.stackroute.domain.Life_Cycle_WithXml.Person;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("interface.xml");
    	
    	Employee e=(Employee)context.getBean("employee");
    	System.out.println(e);
    	context.registerShutdownHook();

	}

}
