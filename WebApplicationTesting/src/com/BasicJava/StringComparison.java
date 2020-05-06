package com.BasicJava;

public class StringComparison {

	public static void main(String[] args) {
		
		String v1="Niveditha";
		String v2="Niveditha";
		if(v1.equals(v2))
		{
			System.out.println("The strings are the same");
		}
		else
		{
			System.out.println("They are not equal");
		}

		System.out.println();
		System.out.println();
		
		String v3="Niveditha";
		String v4="Nive";
		if(v3.equalsIgnoreCase(v4))
		{
			System.out.println("same name");
		}
		else {
			System.out.println("not the same");
		}
		
		System.out.println();
		System.out.println();
		
		if(v3.contains(v4))
		{
			System.out.println("v4 is a part of v3");
		}
		else
		{
			System.out.println("not a part");
		}

		System.out.println("///length method////");
	String v5="Niveditha";
	String v6="AShok";
	
	if(v5.length()>v6.length())
	
	{
		System.out.println("the value of v5 is "+v5.length()+" which is greater than v6");
	}
	}

}
