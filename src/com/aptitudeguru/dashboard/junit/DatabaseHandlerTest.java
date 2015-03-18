package com.aptitudeguru.dashboard.junit;

import com.aptitudeguru.dashboard.DatabaseHandler;

import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;
import android.util.Log;
import java.util.Locale;

public class DatabaseHandlerTest extends AndroidTestCase {

	private DatabaseHandler db;
	DatabaseHandler testCurrency;
	DatabaseHandler testDistance;
	
	protected void setUp() throws Exception {
		super.setUp();
		RenamingDelegatingContext context 
		= new RenamingDelegatingContext(getContext(), "test_");
		db = new DatabaseHandler(context);
		testCurrency = new DatabaseHandler(context);
		testDistance = new DatabaseHandler(context);
	}

	/*public void testAddEntry(){
		// Here i have my new database which is not connected to the standard database of the App
		
	}*/
	
	public void testCurrencyConvert() {
		String testMoney="Rs. 1540";
		String testConversion=testCurrency.currencyConvert(testMoney);
		double testingGBP=1540;
		testingGBP=1540*0.011;
		StringBuffer result = new StringBuffer();
		result.append("£");
		String total = testCurrency.accDecimal(testingGBP);
		result.append(total);
		result.append(" ");
		String testResult=result.toString();
		assertEquals(testConversion,testResult);
	}
	
	
	public void testConvertToMilesEn_US()
	{
		android.content.res.Configuration config = new android.content.res.Configuration();
		
		String testPhrasekm = "A Train travels 20km in 30 minutes. How fast is it travelling?";
		String testPhrasemi = "A Train travels 20miles in 30 minutes. How fast is it travelling?";
		testPhrasekm = testDistance.currencyConvert(testPhrasekm);
		assertEquals(testPhrasekm, testPhrasemi);
		Log.d("Debug", testPhrasekm);
		Log.d("Debug", testPhrasemi);
	}
	

	protected void tearDown() throws Exception {
		db.close(); 
		super.tearDown();
	}
}
