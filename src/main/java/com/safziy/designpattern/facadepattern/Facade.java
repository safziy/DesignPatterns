package com.safziy.designpattern.facadepattern;

public class Facade {
	SubSystemA subSystemA;
	SubSystemB subSystemB;
	SubSystemC subSystemC;
	
	public void work(){
		subSystemA.doSomeThing();
		subSystemB.doSomeThing();
		subSystemC.doSomeThing();
	}
}
