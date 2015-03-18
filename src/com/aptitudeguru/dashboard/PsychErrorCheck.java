package com.aptitudeguru.dashboard;

public class PsychErrorCheck {
	
public static void main(String [] args)
{
	if(rangeCheck("B")) {
		System.out.println("true");
	}
	
	if (intCheck("A")) {
		System.out.println("Yay!");
	} else {
		System.out.println(":(");
	}
}
	
	
	public static boolean intCheck(String string) {	
		if(rangeCheck(string)) {
			return true;
		} else {
			return false;
		}
}


	public static boolean rangeCheck(String temp){
		if(temp == "A" || temp == "B" || temp == "C" || temp == "D" ){
			return true;
		} else {
			return false;
		}
	}	
	
		
}
