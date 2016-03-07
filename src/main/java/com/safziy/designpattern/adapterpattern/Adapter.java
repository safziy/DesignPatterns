package com.safziy.designpattern.adapterpattern;

public class Adapter implements Target {
	
	Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public void mathodA() {
		adaptee.methodB();
	}

}
