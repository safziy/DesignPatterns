package com.safziy.designpattern.singletonpattern;

/**
 * 饿汉式单例类(延时加载)
 * 
 * @author safziy
 *
 */
public class Singleton2 {
//	private static Singleton2 instance = new Singleton2();
	private static class LazyHolder{
		public static Singleton2 holder = new Singleton2(); 
	}

	private Singleton2() {
		System.out.println("Singleton2 init...");
	}

	public static Singleton2 getInstance() {
		return LazyHolder.holder;
	}

	public static void display() {
		System.out.println("display ... ");
	}
}
