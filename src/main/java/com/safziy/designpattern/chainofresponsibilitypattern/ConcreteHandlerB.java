package com.safziy.designpattern.chainofresponsibilitypattern;

public class ConcreteHandlerB implements Handler {

	Handler nextHandler;

	@Override
	public void handlerRequest() {
		// do something

		if (nextHandler != null) {
			nextHandler.handlerRequest();
		}
	}

	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

}
