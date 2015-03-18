package com.aptitudeguru.dashboard.junit;

import com.aptitudeguru.dashboard.DatabaseHandler;
import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;

public class JUnitTestCurrencyAndDistanceForFrance extends AndroidTestCase{
	
	private String currencyTestString1, currencyTestString2;
	private String distanceTestString1, distanceTestString2;
	
	public JUnitTestCurrencyAndDistanceForFrance() {
		super();
		}	
	
	@Override
	protected void setUp() throws Exception
	{
		Context context = this.getContext();
		DatabaseHandler db = new DatabaseHandler(context);
		
		currencyTestString1 = "A car owner buys petrol at Rs. 7.50, Rs. 8 and Rs. 8.50 per litre for three successive years. "
				+ "What approximately is the average cost per litre of petrol if he spends Rs. 4000 each year?";
		
		currencyTestString2 = db.currencyConvert(currencyTestString1);	
		
		distanceTestString1 = "A boat takes 90 minutes less to travel 36 miles downstream than to travel the same distance upstream. "
				+ "If the speed of the boat in still water is 10 mph, the speed of the stream is:";
		
		distanceTestString2 = db.currencyConvert(distanceTestString1); 	
	}
	
	public void testEuros() throws Exception
	{		
		assertFalse("The string should not contain Rs.!", currencyTestString2.contains("Rs."));
		assertTrue("The string should contain €!", currencyTestString2.contains("€"));	
	}
	
	public void testKm() throws Exception
	{		
		assertFalse("The string should not contain miles!", distanceTestString2.contains("miles "));
		assertTrue("The string should contain km!", distanceTestString2.contains("km "));	
		
		assertFalse("The string should not contain mph!", distanceTestString2.contains(" mph"));
		assertTrue("The string should contain km/h!", distanceTestString2.contains("km/h"));	
	}
}
