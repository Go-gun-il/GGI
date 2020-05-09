package com.itbank.abstracts;

import org.omg.CORBA.PUBLIC_MEMBER;

abstract class Ex {
	public abstract int b();
	
	// public abstract void c() {System.out.println("Hello");};

	public void d() {
		System.out.println("Hello");
	}
}

class B extends Ex {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
	}

}
