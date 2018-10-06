package com.pragim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragim.model.Person;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx  =new ClassPathXmlApplicationContext("spring-beans.xml");
		Person person = (Person)ctx.getBean("id1");
		person.getDevice();

	}

}
