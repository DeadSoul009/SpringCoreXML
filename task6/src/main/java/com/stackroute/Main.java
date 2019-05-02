package com.stackroute;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.domain.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie+"\n");

	}

}
