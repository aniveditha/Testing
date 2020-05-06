package com.BasicJava;

public class If_Else_IFProgram {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		int c = 35;
		
		if(a<b&&a<c)
		{
			System.out.println("a is the smallest number");
		}
		else
			if(b<c)
			{
				System.out.println("b is the smallest number");
			}
			else
			{
				System.out.println("c is the smallest number");
			}
		
	}

}
