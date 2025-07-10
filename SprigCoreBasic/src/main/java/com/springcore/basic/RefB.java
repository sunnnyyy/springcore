package com.springcore.basic;

public class RefB {
	private int y;
	private RefA refA;
	public RefB(int y, RefA refA) {
		super();
		this.y = y;
		this.refA = refA;
	}
	public RefB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public RefA getRefA() {
		return refA;
	}
	public void setRefA(RefA refA) {
		this.refA = refA;
	}
	@Override
	public String toString() {
		return "RefB [y=" + y + ", refA=" + refA + "]";
	}
	
}
