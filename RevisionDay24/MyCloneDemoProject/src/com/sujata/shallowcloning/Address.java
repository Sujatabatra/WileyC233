package com.sujata.shallowcloning;

public class Address {

	private int hNo;
	private String streetName;
	private String city;
	private String state;
	private String pincode;
	
	public Address() {
		
	}

	
	public Address(int hNo, String streetName, String city, String state, String pincode) {
		super();
		this.hNo = hNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public int gethNo() {
		return hNo;
	}

	public void sethNo(int hNo) {
		this.hNo = hNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
}
