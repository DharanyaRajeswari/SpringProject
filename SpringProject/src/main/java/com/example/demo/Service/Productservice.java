package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
@Service
public interface Productservice {
	public List<Product>findAll();
	public Product findById(int ProductId);
	public void saveorUpdate(Product c);
	
	public void deleteById(int Product_Id);
}
