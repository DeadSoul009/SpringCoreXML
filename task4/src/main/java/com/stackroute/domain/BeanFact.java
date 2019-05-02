package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
public class BeanFact  implements BeanFactoryAware{
	BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
        System.out.println("setBeanFactory:");
	}
	    public BeanFact(){
	        System.out.println("BeanFactoryAware is Initialized.");
	    }
}
