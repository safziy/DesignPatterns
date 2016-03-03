package com.safziy.designpattern.commandpattern;

public class Invoker {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand(){
		command.execute();
	}
}
