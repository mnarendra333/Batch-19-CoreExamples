package com.pragim.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.springrest.dao.CountryDao;
import com.pragim.springrest.model.Country;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao dao;
	@Override
	public List<Country> countryList() {
		// TODO Auto-generated method stub
		return dao.countryList();
	}
	@Override
	public String addCountry(Country obj) {
		// TODO Auto-generated method stub
		return dao.addCountry(obj);
	}
	@Override
	public String deleteCountry(String countryName) {
		// TODO Auto-generated method stub
		return dao.deleteCountry(countryName);
	}

}
