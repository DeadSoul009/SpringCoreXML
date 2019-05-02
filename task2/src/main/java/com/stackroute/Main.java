package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//Using ApplicationContext
		System.out.println("---------------Using ApplicationContext with constructor injection--------------------------");
		ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
		

		System.out.println("1st entry");
		Movie m1=(Movie)context1.getBean("movie1");
		System.out.println(m1);
		
		System.out.println("2nd entry");
		Actor ar1=(Actor)context1.getBean("actor2");
		System.out.println(ar1);
		
		ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
		Movie m2=(Movie)context2.getBean("movie2");
		System.out.println(m1==m2);
		
		Movie m3=(Movie)context1.getBean("movie2");
		System.out.println(m1==m3);

		System.out.println("4th entry");
		ApplicationContext context3=new ClassPathXmlApplicationContext("beans.xml");
		Movie m4=(Movie)context3.getBean("movie4");
		System.out.println(m4);
		System.out.println("5th entry");
		Movie m5=(Movie)context3.getBean("movie5");
		System.out.println(m5);
		
	}

}
