package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/config.xml");
		
		Employe e = (Employe) context.getBean("employe");
		Employe e1 = (Employe) context.getBean("employe");
		System.out.println(e);
		System.out.println(e.getHobbies());
		System.out.println(e.getHobbies().getClass().getName());
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
	
	}
}
