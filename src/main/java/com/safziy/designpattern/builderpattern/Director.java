package com.safziy.designpattern.builderpattern;

public class Director {
	Builder builder;
	
	void constructComponent(){
		builder.buildComponentA();
		builder.buildComponentB();
	}
}
