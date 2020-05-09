package com.itbank.javatutorial.eclips;

public class for_ {

	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 0; i < 4; i++)
		{
			sum += 1;
		}
		System.out.println(sum);
		
		for(int i = 0; i <= 10; i++)
		{
			if(i % 3 == 0)
			{
				continue;
			}
			else
			{
			System.out.println(i);
			}
		}
	}

}
