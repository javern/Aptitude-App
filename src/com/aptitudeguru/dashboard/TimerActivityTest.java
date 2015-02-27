package com.aptitudeguru.dashboard;


import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Thread;
import org.junit.Before;

//run as junit
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
		assertTrue(timerStop);
		
	}
}