package com.jag.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	private String string;

	public HelloWorldBean(String string2) {
		this.string = string2;
	}

	public String getString() {
		return string;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [string=" + string + "]";
	}
	
	

}
