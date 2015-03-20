package com.aptitudeguru.dashboard;


public class PsychTestDriven {
	String testAns = "ABCDEF4312A";
	boolean moveOn = false;
	
	PsychErrorCheck p = new PsychErrorCheck();
	PsyMarking m = new PsyMarking();
	
	public void test(){
		for (int i = 0; i <= testAns.length(); i++){
			char t = testAns.charAt(i);
			if(p.checkError(t)){
				System.out.println("Yay!");
			} else {
				System.out.println(":(");
			}
		}
	}
	
	public void testMarking(){
		char input = 'A';
		
		m.markA(input);
		showAnswerA();
		
		m.markB(input);
		showAnswerB();
		
		m.markC(input);
		showAnswerC();
		
		m.markD(input);
		showAnswerD();
		
	}
	
	public void showAnswerA(){
		m.printAnswerA();	
	}
	
	public void showAnswerB(){
		m.printAnswerB();
	}
	
	public void showAnswerC(){
		m.printAnswerC();
	}
	
	public void showAnswerD(){
		m.printAnswerD();
	}
		
	
}
