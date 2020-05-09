package com.itbank.javatutorial.eclips;

public class IF_demo {
	public static int conditionTest(int value)
	{
		int ret = 0;
		if(value % 3 == 0)
		{
			ret = 3;
		}
		else if (value % 4 == 0)
		{
			ret = 4;
		}
		else
		{
			ret = -1;
		}
		return ret;
	}
	
	public static void main(String[] args)
	{
		System.out.println(conditionTest(int value));
		
		int score = 0;
		char grade = ' ';
		
		if(score >= 90)
		{
			grade = 'A';
		}
		else if(score >= 80)
		{
			grade = 'B';
		}
		else if(score >= 70)
		{
			grade = 'C';
		}
		else
		{
			grade = 'F';
		}
		
		System.out.println(grade);
		
		boolean isSuccess = false;
		int x = 3;
		
		if(!(x > 1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("x > 1");
		}
		
		if(isSuccess && (x > 1))
		{
			System.out.println("isSuccess && x > 1");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
}
