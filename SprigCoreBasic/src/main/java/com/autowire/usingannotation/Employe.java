package com.autowire.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {
	/* via 3 type we can annotate here
	 * (on var, on setter, on constructor
	 * it will search byType internally
	*/

	@Autowired 
	@Qualifier("address2") // now it will search byName
	private Address address;

//	@Autowired
	public Employe(Address address) {
		super();
		this.address = address;
		System.out.println("using constructor");
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("using setter");
	}

	@Override
	public String toString() {
		return "Employe [address=" + address + "]";
	}
	
	
}
