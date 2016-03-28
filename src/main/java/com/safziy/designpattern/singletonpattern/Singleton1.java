package com.safziy.designpattern.singletonpattern;

/**
 * 饿汉式单例类
 * 
 * @author safziy
 *
 */
public class Singleton1 {
	private static Singleton1 instance = new Singleton1();

	private Singleton1() {
		System.out.println("Singleton1 init...");
	}

	public static Singleton1 getInstance() {
		return instance;
	}

	public static void display() {
		System.out.println("display ... ");
	}
}
