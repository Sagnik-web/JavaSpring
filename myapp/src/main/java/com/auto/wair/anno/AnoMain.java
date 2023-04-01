package com.auto.wair.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnoMain {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/auto/wair/anno/config.xml");
		Emp emp = context.getBean("emp",Emp.class);
		
		System.out.println(emp);
	}
}
