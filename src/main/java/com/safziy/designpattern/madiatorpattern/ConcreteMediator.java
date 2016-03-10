package com.safziy.designpattern.madiatorpattern;

public class ConcreteMediator implements Mediator {
	Colleague colleagueA;
	Colleague colleagueB;
	
	public void setColleagueA(Colleague colleagueA) {
		this.colleagueA = colleagueA;
	}
	
	public void setColleagueB(Colleague colleagueB) {
		this.colleagueB = colleagueB;
	}
}
