package com.migstok.stock.model;

public class ProductOld {
	
	
	private String name;
	private String code;
	private double quantity;
	private int type;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return "Code:" +this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product Name :" + this.name;
	}
	
	
	
	
	
	
	
	

}
