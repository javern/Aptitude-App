package com.aptitudeguru.dashboard;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import android.app.Activity;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.view.MotionEvent;

public class TutorialpageTest extends TestCase {
	
	  Tutorialpage testTutorialpage = new Tutorialpage();
	
	final static float STEP = 200;
    TextView mytv;
    float mRatio = 1.0f;
    int mBaseDist;
    float mBaseRatio;
    float fontsize = 13;

	@Test
	public void testOnTouchEventMotionEvent(MotionEvent event) {
		int eventaction = event.getAction();

	    switch (eventaction) {
	        case MotionEvent.ACTION_DOWN: 
	            // finger touches the screen
	        	assertSame("Check if eventaction and the MotionEvent refer to the same object", eventaction, MotionEvent.ACTION_DOWN);
	            break;

	        case MotionEvent.ACTION_MOVE:
	            // finger moves on the screen
	        	assertSame("Check if eventaction and the MotionEvent refer to the same object", eventaction, MotionEvent.ACTION_MOVE);
	            break;

	        case MotionEvent.ACTION_UP:   
	            // finger leaves the screen
	        	assertSame("Check if eventaction and the MotionEvent refer to the same object", eventaction, MotionEvent.ACTION_UP);
	            break;
	    }
	}

}
