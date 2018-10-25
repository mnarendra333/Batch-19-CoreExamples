package com.pragim.springmvcwithhibernate.dao;

import java.util.List;

import com.pragim.springmvcwithhibernate.model.Product;

public interface ProductDAO {
	
	public List<Product> getAllProducts();

}
