package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.domain.Actor;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------------------using AutoWire=byName-----------------------------------------------------------------------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Actor m1 = (Actor)context.getBean("actor1");
        System.out.println(m1);

        System.out.println("----------------------------------------using constructor--------------------------------------------------------------------------");
        Actor m2 =(Actor) context.getBean("actor2");
        System.out.println(m2);

        System.out.println("---------------------Using AutoWire=byType--------------------------------------------------------------------------------------------");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Actor m3 = (Actor)context2.getBean("actor3");
        System.out.println(m3);
	}

}
