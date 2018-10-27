package com.pragim.springrest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.springrest.model.Country;
import com.pragim.springrest.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Country> countryList(){
		return countryService.countryList();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Map<String,String> add(@RequestBody Country country){
		Map<String,String> map = new HashMap<String,String>();
		map.put("message", countryService.addCountry(country));
		return map;
	}
	
	@RequestMapping(value="/delte/{cname}",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Map<String,String> delete(@PathVariable String cname){
		Map<String,String> map = new HashMap<String,String>();
		map.put("message", countryService.deleteCountry(cname));
		return map;
	}

}
