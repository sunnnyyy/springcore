package com.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean, DisposableBean {
	private int x;

	@Override
	public String toString() {
		return "UsingInterface [x=" + x + "]";
	}

	public UsingInterface(int x) {
		super();
		this.x = x;
	}

	public UsingInterface() {
		super();
		System.out.println("after creating object using-interface");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("at last it will destroy using-interface");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("after init using-interface");
		
	}
	
}
