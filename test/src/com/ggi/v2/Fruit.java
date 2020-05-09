package com.ggi.v2;

public class Fruit {
	String name;
	int price = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		Fruit apple = new Fruit();
		System.out.println(apple.name);
		apple.price = 990;
		System.out.println(apple.name);
	}
}