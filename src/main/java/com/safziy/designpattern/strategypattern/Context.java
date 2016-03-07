package com.safziy.designpattern.strategypattern;

public class Context {
	Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void lookAlgorithm(){
		strategy.algorithm();
	}
}
