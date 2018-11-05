package com.pragim.springrest.service;

import java.util.List;

import com.pragim.springrest.model.Country;

public interface CountryService {
	
	List<Country> countryList();

	String addCountry(Country obj);

	String deleteCountry(String countryName);

	String updateCountry(Country country);

}
