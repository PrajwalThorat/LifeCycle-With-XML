package org.stackroute.domain.Life_Cycle_WithXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle.xml");
    	
    	Person p=(Person)context.getBean("person");
    	System.out.println(p);
    	
    	//registering shutdownhook 
    	context.registerShutdownHook();
    }
}
