package com.springcore.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/basic/config.xml");
		
		RefB b = (RefB) context.getBean("refb");
		System.out.println(b);
	
	}
}
