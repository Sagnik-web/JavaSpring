package students;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		students student = (students) context.getBean("std1");
		context.registerShutdownHook();
		System.out.println(student);
	}
}
