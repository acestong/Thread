package com.stong.myExtends;

public class Demo {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Demo.setName() Setter...");
		this.name = name;
	}

	public Demo(String name) {
		super();
		System.out.println("Demo.Demo()+Constructor...");
		this.name = name;
	}
	
}
