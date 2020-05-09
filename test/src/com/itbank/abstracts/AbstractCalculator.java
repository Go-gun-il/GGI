package com.itbank.abstracts;

public class AbstractCalculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
	
class CalculatorKor extends Calculator{
	public void sum() {
		System.out.println("�� ���� ����: " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("�� ���� �������: " + (this.left + this.right)/2);
	}
}

public class CalculatorEng extends Calculator {
	public void sum() {
		System.out.println("�� ���� ����: " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("�� ���� �������: " + (this.left + this.right)/2);
	}
}
	
	public static void main(String[] args) {
		
	}

}
