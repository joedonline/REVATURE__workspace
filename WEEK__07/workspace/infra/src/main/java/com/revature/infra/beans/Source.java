package com.revature.infra.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Source implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	/*
	 * A resource provided by this source, i.e. water
	 */
	private String resource;

	public Boolean hasResource() {
		if (resource != null) {
			return (resource.length() > 0);
		} else {
			return false;
		}
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("inside setBeanName");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("inside setBeanFactory");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("inside setApplicationContext");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy()");
	}

}
