package com.bean.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
	private int x;

	public UsingAnnotation(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "UsingAnnotation [x=" + x + "]";
	}

	public UsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void custominit() {
		System.out.println("custom init using-annotation");
	}
	
	@PreDestroy
	public void customDestroy() {
		System.out.println("custom destroy using-annotation");
	}
	

}
