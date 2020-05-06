package com.BasicJava;

public class Prime {

	public static void main(String[] args) {
		
		int a = 751;
		int d1=2;
		int d2=3;
		int d3=5;
		
		if(a==d1||a==d2||a==d3)
		{
			System.out.println("a is a prime number");
		}
		else
		if(a%d1 == 0)
		{
			System.out.println("a is not a prime number");		
		}
			else
			if(a%d2 == 0)
			{
				System.out.println("a is not a prime number");			
			}
			else
				if(a%d3 == 0)
				{
					System.out.println("a is not a prime number");
				}
				else
				{
					System.out.println("a is a prime number");
				}
	}

}
