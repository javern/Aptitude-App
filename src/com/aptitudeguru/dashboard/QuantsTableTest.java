package com.aptitudeguru.dashboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class QuantsTableTest {
	
	@Test
	public void test() {
		QuantsTable q = new QuantsTable(01, "quantsques", "quantscat",	"option1", "option2", "option3", "option4", "sol");
		
		System.out.println("Q not null : " + q.getID());
		
	}

	
}

