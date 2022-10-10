package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.Service.Productservice;
@RestController
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
          Productservice Service;
		@GetMapping("/list")
		public List<Product>findAll()
		{
			return Service.findAll();
			
		}
		@GetMapping("/findbystudentID")
		public Product findById(int studentID) {
			return null;
	}
		@PostMapping("/save")
		public void save(@RequestBody Product c) {
			c.setProductdes();
			Service.saveorUpdate(c);
		}
		@PutMapping("/update")
		public void Update(@RequestBody Product c) {
			Service.saveorUpdate(c);
		}
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable int ProductId)
		{
			Product e=findById(ProductId);
			if(e==null)
			{
				throw new RuntimeException("delete id not found");
			}
			else
			{
				Service.deleteById(ProductId);
			}
			return "Product"+ProductId;
		}

}
