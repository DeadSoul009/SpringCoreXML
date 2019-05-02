package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public  class Movie implements ApplicationContextAware{

	ApplicationContext applicationContext;

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)  throws BeansException{
		this.applicationContext = applicationContext;
	}
	Actor actor;
	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [applicationContext=" + applicationContext + ", actor=" + actor + "]";
	}

	public Movie()
	{
		
	}

}
