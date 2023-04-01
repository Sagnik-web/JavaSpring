package com.springcore.jdbc.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;



public class RowMapperImp implements org.springframework.jdbc.core.RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setID(rs.getInt(1));
		student.setEmp_nameString(rs.getString(2));
		student.setCityString(rs.getString(3));
		
		
		return student;
	}

	
	
}
