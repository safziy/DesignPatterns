package com.safziy.designpattern.singletonpattern;
/**
 * 懒汉式单例类(线程安全的  -- 双重校验锁)
 * 
 * @author safziy
 *
 */
public class ConcurrentSingleton {
	private static ConcurrentSingleton instance;
	private static Object lock = new Object();

	private ConcurrentSingleton() {
	}

	public static ConcurrentSingleton getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) { // 注意这里...
					instance = new ConcurrentSingleton();
				}
			}
		}
		return instance;
	}
}
