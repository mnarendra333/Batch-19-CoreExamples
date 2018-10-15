package com.pragim.SpringDIApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Resource res = new ClassPathResource("spring-beans.xml");
		
		BeanFactory factory  = new XmlBeanFactory(res);
		SampleBean obj = (SampleBean)factory.getBean("id1");
		obj.doWork();
	}

}
