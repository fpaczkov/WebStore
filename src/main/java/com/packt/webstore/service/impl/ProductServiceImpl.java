package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepostiory;
	
	public List<Product> getAllProducts(){
		return productRepostiory.getAllProducts();
	}
	public Product getProductById(String productID){
		return productRepostiory.getProductById(productID);
	}
	public List<Product> getProductsByCategory(String category){
		return productRepostiory.getProductsByCategory(category);
	}	
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams){
		return productRepostiory.getProductsByFilter(filterParams);
	}
	public void addProduct(Product product) {
		productRepostiory.addProduct(product);
	}
}
