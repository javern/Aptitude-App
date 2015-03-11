package com.aptitudeguru.dashboard;

public class PsychErrorCheck {
	
public static void main(String [] args)
{
	if(rangeCheck(4)) {
		System.out.println("true");
	}
	
	if (intCheck("6")) {
		System.out.println("Yay!");
	} else {
		System.out.println(":(");
	}
}
	
	
	public static boolean intCheck(String string) {
		int i;
		i = Integer.parseInt(string);
		
		if(rangeCheck(i)) {
			return true;
		} else {
			return false;
		}
}


	public static boolean rangeCheck(int temp){
		if(temp < 1 || temp > 4){
			return false;
		} else {
			return true;
		}
	}	
	
		
}
