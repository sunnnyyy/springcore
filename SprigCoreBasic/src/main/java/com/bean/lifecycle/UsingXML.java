package com.bean.lifecycle;

public class UsingXML {
	private int x;

	public UsingXML(int x) {
		super();
		this.x = x;
	}

	public UsingXML() {
		super();
		System.out.println("after creating object using-xml");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UsingXML [x=" + x + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void init() {
		System.out.println("then init method using-xml");
	}

	public void destroy() {
		System.out.println("at last destroy will call using-xml");
	}

}
