package com.aptitudeguru.dashboard;

import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;
import android.util.Log;
//import junit.framework.Assert;

public class DatabaseHandlerTest extends AndroidTestCase {

	private DatabaseHandler db;

	protected void setUp() throws Exception {
		super.setUp();
		RenamingDelegatingContext context 
		= new RenamingDelegatingContext(getContext(), "test_");
		db = new DatabaseHandler(context);
	}

	public void convertToMilesEn_US()
	{
		String testPhrasekm = "A Train travels 20km in 30 minutes. How fast is it travelling?";
		String testPhrasemi = "A Train travels 20miles in 30 minutes. How fast is it travelling?";
		testPhrasekm = db.currencyConvert(testPhrasekm);
		assertEquals(testPhrasekm, testPhrasemi);
		Log.d("Debug", testPhrasekm);
		Log.d("Debug", testPhrasemi);
	}
	
	/*public void testAddEntry(){
		// Here i have my new database which is not connected to the standard database of the App
		
	}*/

	protected void tearDown() throws Exception {
		db.close(); 
		super.tearDown();
	}
}
