package com.auto.wair.anno;

public class UserData {
	private String name;
	private int UID;
	
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "UserData [name=" + name + ", UID=" + UID + "]";
	}



	public void setName(String name) {
		this.name = name;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
}
