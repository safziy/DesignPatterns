package com.safziy.designpattern.observerpattern;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {

	List<Observer> observerList = new LinkedList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		if (observerList.contains(observer)) {
			observerList.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}

}
