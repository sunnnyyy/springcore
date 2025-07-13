package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spel/config.xml");

		Employe e = (Employe) context.getBean("employe");

		System.out.println(e);
		
		// not using now a days
//		SpelExpressionParser spel = new SpelExpressionParser();
//		org.springframework.expression.Expression exp =  spel.parseExpression("10+5");
//		System.out.println(exp.getValue());

	}
}
