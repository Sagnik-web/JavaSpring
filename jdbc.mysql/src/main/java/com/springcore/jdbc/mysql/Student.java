package com.springcore.jdbc.mysql;

public class Student {
	private int ID;
	private String emp_nameString;
	private String cityString;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getEmp_nameString() {
		return emp_nameString;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", emp_nameString=" + emp_nameString + ", cityString=" + cityString + "]";
	}
	public void setEmp_nameString(String emp_nameString) {
		this.emp_nameString = emp_nameString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	
	
	
}
