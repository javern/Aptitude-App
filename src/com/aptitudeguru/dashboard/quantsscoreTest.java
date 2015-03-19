/**
 * 
 */
package com.aptitudeguru.dashboard;

import androidhive.dashboard.R;
import android.app.Instrumentation.ActivityMonitor;
import android.test.InstrumentationTestCase;
//import android.R;
import android.webkit.WebView.FindListener;
import junit.framework.TestCase;
import android.widget.Button;
import java.lang.Object;

/**
 * @author sondaismith
 *
 */
public class quantsscoreTest extends TestCase {
	
	quantsscore QuantScoreTest;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		QuantScoreTest = new quantsscore();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConstructor()
	{
		assertNotNull(QuantScoreTest);
	}
	
	public void testScoreButtonCommon()
	{
		
	}
	
	public void testQScoreCommon()
	{
		//ActivityMonitor activityMonitor = getInstrumentation()
		
		Button btnTest = (Button) QuantScoreTest.findViewById(R.id.btn_q13);
		btnTest.requestFocus();
		btnTest.performClick();
		//btnTest = (Button) findView
	}
	
	public void testHelpBtn(){
		//QuantScoreTest.bt
	}

}
