package com.aptitudeguru.dashboard;

public class PsychErrorCheck {
		
	public static boolean checkError(char c) {	
		if(rangeCheck(c)) {
			return true;
		} else {
			return false;
		}
}


	public static boolean rangeCheck(char temp){
		if(temp == 'A' || temp == 'B' || temp == 'C' || temp == 'D' ){
			return true;
		} else {
			return false;
		}
	}	
	
		
}
