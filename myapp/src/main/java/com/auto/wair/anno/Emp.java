package com.auto.wair.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("userDataA")
	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	@Override
	public String toString() {
		return "Emp [userData=" + userData + "]";
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
}
