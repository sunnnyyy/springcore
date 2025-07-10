package com.autowire.usingannotation;

public class Address {
	private String street;
	private String area;
	public Address(String street, String area) {
		super();
		this.street = street;
		this.area = area;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", area=" + area + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
