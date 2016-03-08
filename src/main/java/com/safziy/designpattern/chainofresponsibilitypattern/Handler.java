package com.safziy.designpattern.chainofresponsibilitypattern;

public interface Handler {
	void handlerRequest();
	void setNextHandler(Handler nextHandler);
}
