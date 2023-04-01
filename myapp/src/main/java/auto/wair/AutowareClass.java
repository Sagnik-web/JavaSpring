package auto.wair;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowareClass {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("auto/wair/config.xml");
		Emp emp1 = context.getBean("emp",Emp.class);
		context.registerShutdownHook();
		System.out.println(emp1);
	}
}


