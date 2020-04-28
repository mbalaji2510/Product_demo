package com.product.demo.model;

public class Product {
	
	public Product(long id, String name,String domain) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	private long id;
	private String name;
	private String domain;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	

}
