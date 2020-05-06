package com.BasicJava;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		do
		{
			System.out.println("Idhaya is "+i+" yr old");
			i++;
		}while(i<=3);
		System.out.println("'''''''''''''''''''");
		
		int m=4;
		int n=5;
		int k=m+n;
		do
		{
			k=m+n;
		System.out.println("sum is "+k);
		m=m-2;
		}while(m>-5);
		System.out.println("]]]]]]]]]]]]]]]]]]]]]");
		
		int year=2014;
		int age=1;
		do
		{
			System.out.println("This year i.e."+year+" is "+age+" old");
			age=age+1;
			year=year+1;
		}while(age<10);
		
			
		System.out.println("///////////LEAP YEAR/////////");
		
		
				
		for(year=2000;year<=2010;year=year+4)
		{
			if(year%4==0)
			{
			System.out.println(year+" is leap year");
		}}

		System.out.println("^^^^^^CHECKING WHETHER A GIVEN YEAR IS LEAP OR NOT^^^^^");
		
		year=1996;
		if(year%4==0)
		{
			System.out.println("The provided input i.e."+year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
			
	}

}
