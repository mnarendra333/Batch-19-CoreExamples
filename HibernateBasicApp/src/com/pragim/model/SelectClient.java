package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Session session =
				new Configuration().configure().buildSessionFactory().openSession();
		
		Product obj = session.load(Product.class,102);
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getPrice());
	}

}
