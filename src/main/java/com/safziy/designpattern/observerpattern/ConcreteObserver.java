package com.safziy.designpattern.observerpattern;

public class ConcreteObserver implements Observer {

	Subject subject;
	
	@Override
	public void update() {
		System.out.println("I receive notify!");
	}

}
