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
				System.out.println("Ŀ���� ������ �����մϴ�.");
				break;
			}
			coffee--;
			money -= price;
			System.out.println("���� Ŀ�� ���� "+coffee+"�� �Դϴ�.");
			System.out.println("���� �ܾ��� "+money+"�� �Դϴ�.");
			
			   
		}
	}

}
