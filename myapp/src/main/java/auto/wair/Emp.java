package auto.wair;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("Start Called");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy called");
	}
	
	
}
