package com.BasicJava;

public class Grading_Marks {

	public static void main(String[] args) {
		
		//fail,D grade, C grade, B grade, A grade, A+
		
		int M=10;
		
		if(M<=100)
		{
		if(M>=95 && M<=100)
		{
			System.out.println("Your Grade - A+");
		}
		else if(M>80)
		{
			System.out.println("Your Grade - A");
		}
		else if(M>75)
		{
			System.out.println("Your Grade - B");
		}
		else if(M>60)
		{
			System.out.println("Your Grade - C");
		}
		else if(M>40)
		{
			System.out.println("Your Grade - D");			
		}
		else
		{
			System.out.println("YOu are failed");
		}
		}
	}

}
