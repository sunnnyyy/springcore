package com.autowire.usingxml;

public class Employe {
	private Address address;

	public Employe(Address address) {
		super();
		this.address = address;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}
	
	
}
