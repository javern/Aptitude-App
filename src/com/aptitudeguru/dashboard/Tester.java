package com.aptitudeguru.dashboard;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Tester {

  //examples of junit testing and asserts. Run as junit tests 
	
	@Test     
	public final void testStringTest() {
		Testing testing = new Testing();
		String result = testing.stringTest("test");
		
		assertEquals("test", result);

	}

	@Test
	
	public final void greaterThan(){
		
		
		Testing greaterthan = new Testing();
		
		assertFalse(greaterthan.testGreaterThan(4));
			
		
}
	
}

