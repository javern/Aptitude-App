package com.aptitudeguru.dashboard;

import java.lang.Thread;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimerActivityTest {

	boolean timerStop;
	
	@Before
	public void setUp() throws Exception {
	}

	@Before
	public void test() {
		Thread t = new Thread();
		
		try {
			timerStop = false;
			
			t.sleep(3000);
			
			timerStop = true;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void checkTimer() {
		assertFalse(timerStop);
		
	}
}
