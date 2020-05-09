package com.itbank.javatutorial.eclips;

public class wwwwwwwwwwwwwww {

	public static void main(String[] args)
	{
		System.out.println("Quiz 1)");
		System.out.println("");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Quiz 2)");
		System.out.println("");
		
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Quiz 3)");
		System.out.println("");
		
		for(int i=1;i<5;i++){
			for(int j=4;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
