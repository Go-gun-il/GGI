package com.kgitbank.javatutoroal.Interface;

// 인터페이스도 상속이 될까?

interface I3 {
	public void x();
}

interface I4 extends I3 {
	public void y();
}

public class C implements I4 {
	public void x() {}
	public void y() {}
}
