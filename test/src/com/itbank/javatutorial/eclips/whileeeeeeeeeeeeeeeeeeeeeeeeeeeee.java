package com.itbank.javatutorial.eclips;

public class whileeeeeeeeeeeeeeeeeeeeeeeeeeeee {

	public static void main(String[] args)
	{
		int coffee = 10;
		int money = 300;
		int price = 10;
		
		while(money > 0)
		{
			if(coffee == 0)
			{
				System.out.println("커피의 수량이 부족합니다.");
				break;
			}
			coffee--;
			money -= price;
			System.out.println("남은 커피 수는 "+coffee+"잔 입니다.");
			System.out.println("남은 잔액은 "+money+"원 입니다.");
			
			   
		}
	}

}
