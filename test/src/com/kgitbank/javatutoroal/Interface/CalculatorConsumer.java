package com.kgitbank.javatutoroal.Interface;

class CalculatorDummy {
	public void setOprands(int first, int seconds, int tired) {}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer {

	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum());
		System.out.println(c.avg());
		
		CalculatorDummy c1 = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c1.sum());
		System.out.println(c1.avg());
	}

}
