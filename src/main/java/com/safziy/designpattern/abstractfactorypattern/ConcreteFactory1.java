package com.safziy.designpattern.abstractfactorypattern;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public ProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB1();
	}

}
