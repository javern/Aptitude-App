package com.aptitudeguru.dashboard;

public class PsyMarking {
	
	public static void markA(char score) {
			if(score == 'C'){
				System.out.println("You got it right!");
			} else {
				System.out.println("Sorry, it's the 3 most effective response, you answered: " + score);
			}
	}
	
	public static void markB(char score) {
		if(score == 'D'){
			System.out.println("You got it right!");
		} else {
			System.out.println("Sorry, it's the 4 most effective response, you answered: " + score);
		}
	}
	
	
	public static void markC(char score) {
		if(score == 'A'){
			System.out.println("You got it right!");
		} else {
			System.out.println("Sorry, it's the most effective response, you answered: " + score);
		}
	}
	
	public static void markD(char score) {
		if(score == 'B'){
			System.out.println("You got it right!");
		} else {
			System.out.println("Sorry, it's the 2 most effective response, you answered: " + score);
		}
	}
	
	
	
	

	public static void printAnswerD() {
		System.out.println("D – The second most effective response. You are being sympathetic and friendly, although you are not helping him ‘move on’. Also there is a danger he may interpret your sympathy as support for his point of view.");
	}
	
	public static void printAnswerC() {
		System.out.println("C – The most effective response. You are emphasising with Mr Bowler but not supporting his negative view of the process. You are encouraging him to seek more information and feedback as to why he didn’t get the job which may help him develop and continue to contribute well to the department and the hospital.");
	}
	
	public static void printAnswerB() {
		System.out.println("B – The least effective response. Since you are only an assistant it is not your role to give such feedback to Mr Bowler, which may be counterproductive. You should also be encouraging him to seek feedback from the interviewers directly. Also, Mr Bowler needs to be given a fully-rounded picture of his performance at the interview and why the interviewers felt that they wouldn’t offer him the job on this occasion.");
	}

	public static void printAnswerA() {
		System.out.println("A – The third most effective response. Although this is all perfectly true, it is a little insensitive and you are likely to alienate Mr Bowler and as he is still an employee at the hospital this may not be sensible.");		
	}



}
