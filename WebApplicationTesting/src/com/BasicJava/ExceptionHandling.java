package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args) {

		try
		{
		int a =10;
		int b=0;
		int c;
		
		System.out.println("The value of c is:"+(a/b));
		}
		catch(Exception e)
		{
		
			System.out.println(e);
			System.out.println("Passed");
		}		
				

		

	}

}
