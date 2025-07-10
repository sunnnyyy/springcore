package com.springcore.basic;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpColl {
	private List<String> name;
	private Set<String> address;
	private Map<String, String> courses;
	public EmpColl(List<String> name, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	public EmpColl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "EmpColl [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/basic/config.xml");
		EmpColl e = (EmpColl) context.getBean("emp");
		System.out.println(e);
	}
}
