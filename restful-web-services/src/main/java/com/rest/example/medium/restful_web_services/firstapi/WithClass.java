package com.rest.example.medium.restful_web_services.firstapi;

public class WithClass {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	//constructor
	public WithClass(String text) {
		this.text=text;
		
	}

	@Override
	public String toString() {
		return "WithClass [text=" + text + "]";
	}

}
