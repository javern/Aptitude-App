package com.aptitudeguru.dashboard;

import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;

public class DatabaseHandlerTest extends AndroidTestCase {

	private DatabaseHandler db;

	protected void setUp() throws Exception {
		super.setUp();
		RenamingDelegatingContext context 
		= new RenamingDelegatingContext(getContext(), "test_");
		db = new DatabaseHandler(context);
	}

	/*public void testAddEntry(){
		// Here i have my new database which is not connected to the standard database of the App
		
	}*/

	protected void tearDown() throws Exception {
		db.close(); 
		super.tearDown();
	}
}
