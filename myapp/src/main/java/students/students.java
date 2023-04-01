package students;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class students implements InitializingBean, DisposableBean{
	@Override
	public String toString() {
		return "students [name=" + name + "]";
	}

	private String name;

	public students(String name) {
		super();
		this.name = name;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method Called");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init Method called");
		
	}
}
