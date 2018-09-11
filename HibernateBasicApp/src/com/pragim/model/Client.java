package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//session factory is a heavy wight component 
		//it manages all the db connections
		//hibernate settings
		//mapping info
		SessionFactory factory = conf.buildSessionFactory();
		
		//before performing any operation in hibernate we need session object
		//to enable the local cache
		//to make use of all the existing methods 
		//which are present inside session like save(-)/update(-)/delete/get
		Session session = factory.openSession();
		
		//prepare the object to save
		
		Product obj  =new Product();
		obj.setId(101);
		obj.setName("Dell5600");
		obj.setPrice(56000);
		
		session.save(obj);
		
		
		Transaction tx = session.beginTransaction();
		tx.commit();
	}

}
