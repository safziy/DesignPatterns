package com.safziy.designpattern.builderpattern;

public interface Builder {
	void buildComponentA();
	
	void buildComponentB();
	
	Product getProduct();
}
