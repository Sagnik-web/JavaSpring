package auto.wair;

public class Address {
	@Override
	public String toString() {
		return "Address [city=" + city + ", homeNo=" + homeNo + ", pin=" + pin + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String city;
	private String homeNo;
	private String pin;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHomeNo() {
		return homeNo;
	}
	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	public Address(String city, String homeNo, String pin) {
		super();
		this.city = city;
		this.homeNo = homeNo;
		this.pin = pin;
	}
	
	
}
