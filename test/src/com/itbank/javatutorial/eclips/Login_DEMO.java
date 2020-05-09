package com.itbank.javatutorial.eclips;

import java.util.Scanner;

public class Login_DEMO {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String id = scan.next();
		int password = scan.nextInt();
		System.out.println("ID : "+id);
		System.out.println("PASSWORD : "+password);
	}
}
