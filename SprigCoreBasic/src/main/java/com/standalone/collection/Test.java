package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/standalone/collection/config.xml");
	
	CollectionClass cl = (CollectionClass) context.getBean("coll");
	System.out.println(cl.getCourseName().getClass().getName());
	System.out.println(cl.getCourseFee().getClass().getName());
	System.out.println(cl.getConfig().getClass().getName());
}
}
