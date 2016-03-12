package com.safziy.designpattern.abstractfactorypattern;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public ProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB2();
	}

}
