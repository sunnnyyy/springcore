package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")// be default it is singleton but we can add scope=prototype here so now we can created multiple object with other objects
public class Employe {
	@Value("sunny")
	private String name;

	@Value("patna")
	private String address;

	@Value("#{5 > 1 ? true: false}")
	private boolean flag;

	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double sqrt;

	@Value("#{ T(java.lang.Math).PI }")
	private double PI;

	@Value("#{ new java.lang.String('us tech noida')}")
	private String Company;

	public Employe(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", address=" + address + ", flag=" + flag + ", sqrt=" + sqrt + ", PI=" + PI
				+ ", Company=" + Company + "]";
	}

}
