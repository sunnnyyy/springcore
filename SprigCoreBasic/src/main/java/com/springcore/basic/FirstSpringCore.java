package com.springcore.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringCore {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});
	
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student) context.getBean("student1");
		System.out.println(s);
		Student s2 = (Student) context.getBean("student2");
		System.out.println(s2);
		Student s3 = (Student) context.getBean("student3");
		System.out.println(s3);
	
	}
}
