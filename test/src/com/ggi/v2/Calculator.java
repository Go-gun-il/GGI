package com.ggi.v2;

public class Calculator {
	int a, b;
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	
	
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int multiply() {
		return a*b;
	}

	public static void main(String[] args) {
		int c = 1;
		int d = 1; 
		Calculator calc = new Calculator();
	}

}



