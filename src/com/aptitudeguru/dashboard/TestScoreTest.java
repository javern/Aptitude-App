package com.aptitudeguru.dashboard;

import java.util.List;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;
import androidhive.dashboard.R;
import junit.framework.TestCase;

public class TestScoreTest extends TestCase {

	TestScore testing;

	protected void setUp() throws Exception {
		super.setUp();
		testing = new TestScore();
	}


	public void testConstructor()
	{
		assertNotNull(testing);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


}
