package com.pragim.springmvcwithhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragim.springmvcwithhibernate.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDAO {

	@Autowired
	private SessionFactory factory;
	
	@Override

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("from Product p");
		List<Product> list = query.list();
		
		return list;
	}

}
