package com.safziy.designpattern.commandpattern;

public class ConcreteCommand implements Command {

	Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.action();
	}

}
