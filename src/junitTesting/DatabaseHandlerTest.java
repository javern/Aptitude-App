package junitTesting;

import com.aptitudeguru.dashboard.DatabaseHandler;

import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;

public class DatabaseHandlerTest extends AndroidTestCase {

	private DatabaseHandler db;
	DatabaseHandler testCurrency;
	
	protected void setUp() throws Exception {
		super.setUp();
		RenamingDelegatingContext context 
		= new RenamingDelegatingContext(getContext(), "test_");
		db = new DatabaseHandler(context);
		testCurrency=new DatabaseHandler(context);
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

	protected void tearDown() throws Exception {
		db.close(); 
		super.tearDown();
	}
}
