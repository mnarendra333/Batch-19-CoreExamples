package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DeleteClient {
	
	public static void main(String[] args) {
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Product obj = session.get(Product.class,101);
		
		if(obj!=null)
			session.delete(obj);
		session.beginTransaction().commit();
		
	}

}
