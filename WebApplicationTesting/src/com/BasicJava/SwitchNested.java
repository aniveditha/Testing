package com.BasicJava;

public class SwitchNested {

	public static void main(String[] args) {
		
		int y=4;
		
		char B='M';
				
		switch(y)
		{
			case 1: System.out.println("Engilsh, Maths, Physics");
			break;
			case 2: 
				switch(B)
				{
				case 'C':System.out.println("FLuid mechanics-I, theory  of structures-I,Surveying");
				break;
				case 'I':System.out.println("Operating system, Java");
				break;
				case 'E':System.out.println("Micro processors ,logic switching theory");
				break;
				case 'M':System.out.println("Mechanics, Drawings");
				break;	
				}
				break;
			case 3:
				switch(B)
				{
				case 'C':System.out.println("FLuid mechanics-II, Concrete Structures Design");
				break;
				case 'I':System.out.println("Compter organisation, Multimedia");
				break;
				case 'E':System.out.println("Embedded System, Image Processing");
				break;
				case 'M':System.out.println("Internal Combustion engines, Mechanical Vibration");
				break;	
				}
				break;
			case 4:
				switch(B)
				{
				case 'C':System.out.println("Project Management, Transportation");
				break;
				case 'I':System.out.println("Computer-IV, OS-IV course");
				break;
				case 'E':System.out.println("ES Cpurse-IV");
				break;
				case 'M':System.out.println("Production Technology, Thermal Engineering");
				break;	
				}
				break;
		}
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^SWITCH PRACTICE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println();
		
		int x=10;
		//String M="";
		switch(x)
	
		{
		case 1:System.out.println("January");
		break;
		case 2:System.out.println("February");
		break;
		case 3:System.out.println("MArch");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("Novemeber");
		break;
		case 12:System.out.println("December");
		break;
		}
						
		}

	}


