package com.itbank.javatutorial.eclips;

import java.util.Scanner;

public class LOGIN {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String id = scan.next();
		int pw = scan.nextInt();
		
		if(id.equals("Eclipse"))
		{
			if(pw == 0000)
			{
				System.out.println("welcome");
			}
			else
			{
				System.out.println("Please enter the correct PASSWORD");
			}
		}
		else
		{
			System.out.println("Please enter the correct ID");
		}
	}

}
