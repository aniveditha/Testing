package com.BasicJava;


public class Assignment_1203 {

	public static void main(String[] args) {
		
		int i;
		//String s="*";
		//String c=" ";  //if the same variable is assigned to char data type, number is being shown in output at the line start.y?
		//char ch='*';
		
		
		for(i=1;i<=3;i=i+1)
		{
			 if(i==1)
				{
				System.out.println("*");
				}
			if(i==2)
			{
				System.out.println("* *");
				}
			if(i==3)
			{
				System.out.println("* * *");
				}
				}
		
	    System.out.println("");
		System.out.println("");
		System.out.println("");
		
		for(i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
		
				System.out.print("* ");
				
			}
		System.out.println(" ");

		}
		
	/*	
		i=1;
		while(i<=10)
		{
		if(i==1||i==10)	
		{
			System.out.println(c+c+c+c+s);
		}
		if(i==2||i==9)
		{
			System.out.println(c+c+c+s+c+s);
			}
		if(i==3||i==8)
		{
			System.out.println(c+c+s+c+s+c+s); //if we are giving space using " ", we are not encountering the value 64 in the output in 3rd and 8th lines
			}
		if(i==4||i==7)
		{
			System.out.println(c+s+c+s+c+s+c+s);
			}
		if(i==5||i==6)
		{
			System.out.println(s+c+s+c+s+c+s+c+s);
			}
		i=i+1;
		}
	
	*/
	}

}
