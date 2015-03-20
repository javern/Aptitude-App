package com.aptitudeguru.dashboard.junit;

import com.aptitudeguru.dashboard.DatabaseHandler;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;


public class JUnitRankOrderInput extends AndroidTestCase{
	private char answerA, answerB, answerC, answerD;
	
	public JUnitRankOrderInput() {	
		
		super();
		
	}
	
	@Override
	protected void setUp() throws Exception
	{
	//	answerA = Psych.answerATextView.getText();
	//	answerB = Psych.answerBTextView.getText();
	//	answerC = Psych.answerCTextView.getText();
	//	answerD = Psych.answerDTextView.getText();
	}
	
	
	public void testAnswerRanking() {
		
		assertTrue("The Correct answer for A is C", answerA=='C');
		assertTrue("The Correct answer for B is D", answerB=='D');
		assertTrue("The Correct answer for C is A", answerC=='A');
		assertTrue("The Correct answer for D is B", answerD=='B');

		
		
	}

}
