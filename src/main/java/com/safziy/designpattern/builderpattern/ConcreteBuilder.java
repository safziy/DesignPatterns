package com.safziy.designpattern.builderpattern;

public class ConcreteBuilder implements Builder{

	Product product;
	
	@Override
	public void buildComponentA() {
		System.out.println("build component A");
	}

	@Override
	public void buildComponentB() {
		System.out.println("build component B");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
