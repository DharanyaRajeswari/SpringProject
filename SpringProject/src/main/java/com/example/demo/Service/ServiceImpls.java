package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Dao.Productdao;
import com.example.demo.entity.Product;


public class ServiceImpls  implements Productservice{
	
	@Autowired
	Productdao Dao;
		@Override
		public List<Product> findAll() {
			// TODO Auto-generated method stub
			return ((Productservice) Dao).findAll();
		}
	@Override
	public void saveorUpdate(Product c) {
		Dao.save(c);
	}

	public void deleteById(int ProductId) {
		// TODO Auto-generated method stub
		Dao.deleteById(ProductId);
	}
	@SuppressWarnings("null")
	@Override
	public Product findById(int ProductId) {
		Optional<Product>c= Dao.findById(ProductId);
		Product c1=null;
		if(c==null)
		{
			c1=c.get();
		}
		return c1;
		
	}
}

