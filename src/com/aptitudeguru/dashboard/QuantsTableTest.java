package com.aptitudeguru.dashboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuantsTableTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		QuantsTable q = new QuantsTable(01, "quantsques", "quantscat",	"option1", "option2", "option3", "option4", "sol");
		
		if(q == null){
			System.out.println("Item is empty");
		} else {
			System.out.println("Q not null : " + q.getID());
		}
		
	}

}
