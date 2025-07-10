package com.autowire.usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/usingannotation/config.xml");
	
		Employe employe = (Employe) context.getBean("emp");
		System.out.println(employe);
		
	}
}
