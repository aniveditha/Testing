package com.BasicJava;

public class Assignment_1503 {

	public static void main(String[] args) {
		
		 int i=1;
		while(i<=3)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println(" "); 
			i++;
		} 

System.out.println();
System.out.println();
System.out.println();

for(i=4;i>=1;i--)
{
	for(int j=4;j>=i;j--)
	{
		System.out.print("* ");
	}
	System.out.println();
}
	}
	

}