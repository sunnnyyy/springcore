package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")// be default it is singletone but we can add scope=prototype here so now we can created multiple object with other objects
public class Employe {
	@Value("sunny")
	private String name;
	@Value("patna")
	private String address;
	
	@Value("#{myHobbies}")
	private List<String> hobbies;
	

	public Employe(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	

}
