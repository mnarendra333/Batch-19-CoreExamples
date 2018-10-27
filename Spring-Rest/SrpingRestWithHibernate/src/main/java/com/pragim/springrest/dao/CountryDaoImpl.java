package com.pragim.springrest.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragim.springrest.model.Country;
@Repository
@Transactional
public class CountryDaoImpl implements CountryDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Country> countryList() {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		List<Country> countryList = session.createQuery("from Country c").list();
		return countryList;
	}

	@Override
	public String addCountry(Country obj) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		session.save(obj);
		return "Country added successfully";
	}

	@Override
	public String deleteCountry(String countryName) {
		// TODO Auto-generated method stub
		Session session = factory.getCurrentSession();
		int count = session.createQuery("delete from Country c where c.countryName=?").setParameter(0, countryName).executeUpdate();
		return "Country deleted successfully";
	}

}
