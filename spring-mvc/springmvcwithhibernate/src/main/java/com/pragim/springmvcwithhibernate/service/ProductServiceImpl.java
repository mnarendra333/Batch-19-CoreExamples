package com.pragim.springmvcwithhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.springmvcwithhibernate.dao.ProductDAO;
import com.pragim.springmvcwithhibernate.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDAO.getAllProducts();
	}

}
