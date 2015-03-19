package com.aptitudeguru.dashboard;

public class PsychTestDriven {
	String testAns = "ABCDEF4312A";
	boolean moveOn = false;
	
	public void test(){
		for (int i = 0; i <= testAns.length(); i++){
			char t = testAns.charAt(i);
			checkError();
		}
	}
	
	public void testMarking(){
		char input = 'A';
		
		markA(input);
		showAnswerorA();
		
		markB(input);
		showAnswerorB();
		
		markC(input);
		showAnswerorC();
		
		markD(input);
		showAnswerorD();
		
	}
	
	public void showAnswer(){
		System.out.println(printAnswer());
	}
	}
	
	
}
