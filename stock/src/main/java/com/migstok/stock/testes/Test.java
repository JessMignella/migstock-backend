package com.migstok.stock.testes;

import com.migstok.stock.model.Product;

public class Test extends Product{

	public static void main(String[] args) {
		
		
		
		
    Product pd = new Product();
		 pd.setName("mouse");
		 pd.setQuantity(25);
		 
		
		 Product pd1 = new Product();
		 pd1.setName("keyboard");
		 pd1.setCode("2526");
		
		System.out.println(pd.getName());
		System.out.println(pd.toString());
		System.out.println(pd1.toString());
		System.out.println(pd1.getCode());
		System.out.println(pd1.getName());
		
		//System.out.println("mouse"+pd.getQuantity());
		
	}
}
