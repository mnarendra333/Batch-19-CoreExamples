package com.pragim.springmvcwithhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pragim.springmvcwithhibernate.model.Product;
import com.pragim.springmvcwithhibernate.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/list")
	public String getAllProducts(Model model){
		
		List<Product> list = productService.getAllProducts();
		for (Product product : list) {
			System.out.println(product);
		}
		model.addAttribute("plist", list);
		return "productListView";
	}
	

}
