package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UpdateClient {
	
	public static void main(String[] args) {
		
		//Session openSession = new Configuration().configure().buildSessionFactory().openSession();
		
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Product product = session.get(Product.class, 101);
		product.setPrice(66000);
		session.update(product);
		session.beginTransaction().commit();
		
	}

}
