package com.stackroute;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.stackroute.domain.Movie;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("First entry with application context");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Movie m1 = (Movie)context1.getBean("movie1");
        System.out.println(m1);
		
		System.out.println("Using ApplicationContextAware");
        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Movie m2 = (Movie)context2.getBean("movie1");
        System.out.println(m2);
        m2.setApplicationContext(context1);



        AbstractApplicationContext  context3 = new ClassPathXmlApplicationContext("beans1.xml");
        context3.registerShutdownHook();
        
	}

}
 