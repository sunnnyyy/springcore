package com.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AllLifeCycle {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bean/lifecycle/config.xml");
	
		UsingXML u = (UsingXML) context.getBean("usingxml");
		System.out.println(u);
		
		
		context.registerShutdownHook();
		// it will call destroy method of usingxml and interface
		System.out.println("+++++++++++++");
		
		UsingInterface ui = (UsingInterface) context.getBean("usinginterface");
		System.out.println(ui);
		
		
		System.out.println("+++++++++++++");
//		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("com/bean/lifecycle/config.xml");
		
		UsingAnnotation un = (UsingAnnotation) context.getBean("usingannotation");
		System.out.println(un);
		
	
	}
}
