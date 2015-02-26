package com.aptitudeguru.dashboard;

import junit.framework.TestCase;

public class VLTableTest extends TestCase {

	VLTable vlTTest;
	int vlid;
	String ques;
	String cat;
	String option1;
	String option2;
	String option3;
	String option4;
	String sol;

	protected void setUp() throws Exception {
		super.setUp();
		vlTTest=new VLTable();
		vlid=4;
		ques="test";
		cat="vl";
		option1="a";
		option2="b";
		option3="c";
		option4="d";
		sol="C";
		testSetEverything();
	}

	public void testConstructor()
	{
		assertNotNull(vlTTest);
	}

	public void testSetEverything(){
		vlTTest.setID(vlid);
		vlTTest.setQues(ques);
		vlTTest.setCat(cat);
		vlTTest.setOption1(option1);
		vlTTest.setOption2(option2);
		vlTTest.setOption3(option3);
		vlTTest.setOption4(option4);
		vlTTest.setSol(sol);
	}

	public void testGetID() {

		assertEquals(vlid,vlTTest.getID());
	}

	public void testGetQues() {

		assertEquals(ques,vlTTest.getQues());
	}

	public void testGetCat() {

		assertEquals(cat,vlTTest.getCat());
	}

	public void testGetOption1() {

		assertEquals(option1,vlTTest.getOption1());
	}

	public void testGetOption2() {

		assertEquals(option2,vlTTest.getOption2());
	}
	
	public void testGetOption3() {

		assertEquals(option3,vlTTest.getOption3());
	}
	
	public void testGetOption4() {

		assertEquals(option4,vlTTest.getOption4());
	}

	public void testGetSol() {

		assertEquals(sol,vlTTest.getSol());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
