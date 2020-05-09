package com.kgitbank.javatutoroal.Interface;

class E {
	public String x() {
		return "x";
	}
}

class F extends E {
	public String y() {
		return "y";
	}
	public String x() {
		return "F.x";
}

	}
}

public class polymorphismDemo1 {

	public static void main(String[] args) {
		E obj = new F();
		obj.x();
		obj.y();
	}

}
