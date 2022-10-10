package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	@Column(name="product_name")
	private String product_name;
	@Column(name="productdes")
	private String productdes;
	@Column(name="Itemsinstock")
	private int Itemsinstock;
	@Column(name="Manufacturedate")
	private LocalDate Manufacturedate;
	@Column(name="Expirydate")
	private LocalDate Expirydate;
	public Product()
	{
		
	}
	public Product(int id,String product_name,String productdes,int Iteminstock,LocalDate Manufacturedate,LocalDate Expirydate)
	{
		 super();
		    this.id = id;
		    this.product_name = product_name;
		    this.productdes = productdes;
		    this.Itemsinstock = Iteminstock;
		    this.Manufacturedate = Manufacturedate;
		    this.Expirydate = Expirydate;
		
	}
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProductdes() {
		return productdes;
	}
	public void setProductdes() {
		this.productdes = productdes;
	}
	public int getItemsinstock() {
		return Itemsinstock;
	}
	public void setItemsinstock(int itemsinstock) {
		Itemsinstock = itemsinstock;
	}
	public LocalDate getManufacturedate() {
		return Manufacturedate;
	}
	public void setManufacturedate(LocalDate manufacturedate) {
		Manufacturedate = manufacturedate;
	}
	public LocalDate getExpirydate() {
		return Expirydate;
	}
	public void setExpirydate(LocalDate expirydate) {
		Expirydate = expirydate;
	}
	
}
