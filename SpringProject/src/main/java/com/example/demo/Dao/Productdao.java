package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Product;

@RepositoryRestResource(path="jpa")
public interface Productdao  extends JpaRepository<Product, Integer>{

}
