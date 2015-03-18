package com.aptitudeguru.dashboard.junit;

import com.aptitudeguru.dashboard.DatabaseHandler;
import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;

public class JUnitTestDollarsForUS extends AndroidTestCase{
	
	String testString;
	String testString2;
	
	public JUnitTestDollarsForUS() {
		super();
		}	
	
	@Override
	protected void setUp() throws Exception
	{
		Context context = this.getContext();
		DatabaseHandler db = new DatabaseHandler(context);
		
		testString = "A car owner buys petrol at Rs. 7.50, Rs. 8 and Rs. 8.50 per litre for three successive years. "
				+ "What approximately is the average cost per litre of petrol if he spends Rs. 4000 each year?";
		
		testString2 = db.currencyConvert(testString);	
		// This is just to look at the string after conversion
		Log.d("Plamen", testString2);
	}
	
	public void testDollarSymbol() throws Exception
	{		
		assertFalse("The string should not contain Rs.!", testString2.contains("Rs."));
		assertTrue("The string should contain $!", testString2.contains("$"));	
	}
}
