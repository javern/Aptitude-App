package com.aptitudeguru.dashboard.junit;

import android.test.AndroidTestCase;

public class JUnitTestPhychTestAnswerInput extends AndroidTestCase
{
	private char answerA, answerB, answerC, answerD;
	
	public JUnitTestPhychTestAnswerInput()
	{
		super();
	}
	
	@Override
	protected void setUp() throws Exception
	{
		answerA = Psych.answerATextView.getText();
		answerB = Psych.answerBTextView.getText();
		answerC = Psych.answerCTextView.getText();
		answerD = Psych.answerDTextView.getText();
	}
	
	public void testPhychTestAnswerInput()
	{
		assertTrue("The answer letter for A should be only A, B, C or D!", (answerA=='A'||answerA=='B'||answerA=='C'||answerA=='D'));
		assertTrue("The answer letter for B should be only A, B, C or D!", (answerB=='A'||answerA=='B'||answerA=='C'||answerA=='D'));
		assertTrue("The answer letter for C should be only A, B, C or D!", (answerB=='A'||answerA=='B'||answerA=='C'||answerA=='D'));
		assertTrue("The answer letter for D should be only A, B, C or D!", (answerB=='A'||answerA=='B'||answerA=='C'||answerA=='D'));
	}
}
