package com.safziy.designpattern.factorypattern;

public class ConcreteCreatorB implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}

}
