package com.safziy.designpattern.singletonpattern;

public class Client {
	public static void main(String[] args) {
		Singleton1.display();
		
		Singleton2.display();
		Singleton2.getInstance();
	}
}
