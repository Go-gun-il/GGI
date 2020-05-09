package com.kgitbank.javatutoroal.Interface;

class D {
	public void a(int param) {
		System.out.println("숫자 출력"+param);
	}
	public void a(String param) {
		System.out.println("문자 출력"+param);
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");
	}

}
