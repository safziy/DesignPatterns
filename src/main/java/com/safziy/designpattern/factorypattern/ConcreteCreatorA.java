package com.safziy.designpattern.factorypattern;

public class ConcreteCreatorA implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}

}
