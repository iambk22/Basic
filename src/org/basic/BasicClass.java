package org.basic;

public class BasicClass {
	public void add() {
		System.out.println("Add");

	}
	public void sub() {
		System.out.println("Sub");

	}
	public void mul() {
		System.out.println("Mul");

	}
	public void div() {
		System.out.println("Div");
	}
	
	public static void main(String[] args) {
		BasicClass b = new BasicClass();
		b.add();
		b.sub();
		b.mul();
		b.div();
	}
	
	

}
