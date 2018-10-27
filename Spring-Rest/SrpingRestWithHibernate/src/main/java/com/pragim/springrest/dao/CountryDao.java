package com.pragim.springrest.dao;

import java.util.List;

import com.pragim.springrest.model.Country;

public interface CountryDao {
	
	List<Country> countryList();

	String addCountry(Country obj);

	String deleteCountry(String countryName);

}
