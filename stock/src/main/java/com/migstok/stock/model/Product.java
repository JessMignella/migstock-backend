package com.migstok.stock.model;

public class Product {
	
	
	private String name;
	private String model;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return "Code:" +this.model;
	}
	public void setCode(String code) {
		this.model = code;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product Name :" + this.name;
	}
	
	
	
	
	
	
	
	

}
