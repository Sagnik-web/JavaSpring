package com.springcore.myapp;

public class Users {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter Method Called");
		this.name = name;
	}

//	public Users(String name) {
//		super();
//		this.name = name;
//	}
//
//	public Users() {
//		
//	}
	@Override
	public String toString() {
		return "Users [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Init Method Called");
	}
	
	public void destroy() {
		System.out.println("Destroy Method Called");
	}
	
}
