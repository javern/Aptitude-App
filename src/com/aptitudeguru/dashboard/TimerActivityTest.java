package com.aptitudeguru.dashboard;

import java.lang.Thread;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimerActivityTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Thread t = new Thread();
		
		try {
			t.sleep(3000);
			System.out.println("Timer Test");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
