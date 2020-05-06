package com.BasicJava;

public class Levels_Switch {

	public static void main(String[] args) {
		
		String Exp="Not at all good";
		int Level;
		
		switch(Exp)
		{
		
		/*
		 case "Excellent": System.out.println("Level-1");
		 break;
		case "Satisfactory": System.out.println("Level-4");
		break;
		case "Average": System.out.println("Level-5");
		break;
		case "Very Good":System.out.println("Level-2");
		break;
		case "Good":System.out.println("Level-3");
		break;
		default:System.out.println("Level-6");
		*/
		
		
		case "Excellent":Level=1;
		break;
		case "Very Good":Level=2;
		break;
		case "Good":Level=3;
		break;
		case "Average":Level=4;
		break;
		case "Satisfied":Level=5;
		break;
		default:Level=6;
		
		
			
		}
System.out.println("the level of your satisfaction is "+Level);
				
	}

}
