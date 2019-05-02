package com.stackroute;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

@SuppressWarnings("deprecation")
public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using ApplicationContext
		System.out.println("---------------Using ApplicationContext--------------------------");
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Actor ar=(Actor)context.getBean("actor1");
		Movie m=(Movie)context.getBean("movie1");
		System.out.println("Name:"+m.getActor().getName());
		System.out.println("Gender:"+m.getActor().getGender());
		System.out.println("Age:"+m.getActor().getAge());

		//Using XmlBeanFactory
		System.out.println("---------------Using BeanFactory--------------------------");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Actor ac=(Actor)factory.getBean("actor2");
		Movie mo=(Movie)factory.getBean("movie2");
		System.out.println("Name:"+mo.getActor().getName());
		System.out.println("Gender:"+mo.getActor().getGender());
		System.out.println("Age:"+mo.getActor().getAge());
	}

}