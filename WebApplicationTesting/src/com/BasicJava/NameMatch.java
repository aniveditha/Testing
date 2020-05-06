package com.BasicJava;

public class NameMatch {

	public static void main(String[] args) {
		
		String N="Niv";
		String A="Arun";
		String I="Idhu";
		String S="Shri";
		
		switch(A)
		{
		case "Niv":
			System.out.println("the name is matching to: "+N);
			break;
		case "Idhu":
			System.out.println("the name is matching to: "+I);
			break;
		case "Ash":
     		System.out.println("the name is matching to: "+A);
     		break;
		case "Shri":
			System.out.println("the name is matching to: "+S);
			break;
			default:
				System.out.println("Not Matching");
		}
		
	}

}
