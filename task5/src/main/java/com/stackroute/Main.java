package com.stackroute;

import org.springframework.context.support.ClassPathXmlApplicationContext; 
import com.stackroute.domain.LifeCycle;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        LifeCycle life = (LifeCycle)context.getBean("beanlifecycle");

            context.close();

	}

}
