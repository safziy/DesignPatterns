package com.safziy.designpattern.singletonpattern;

/**
 * 懒汉式单例类
 * 
 * @author safziy
 *
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
