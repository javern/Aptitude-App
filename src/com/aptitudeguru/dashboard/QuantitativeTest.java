package com.aptitudeguru.dashboard;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class QuantitativeTest {

	String r;

	/* Testing equals*/
	@Test
	public void assertArrayEquals() {

		arrayEquals(createIntArrayA(), createIntArrayB());
		
		arrayEqualsSecond(createIntArrayA(), createIntArrayB());
	}
	@Test
	public void assertEquals() {
		double a = 2.3;
		double b = 2.3;
		
		if (a == b) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}	
	@Test
	public void assertEqualsSecond() {
		QuantitativeTest myJunit = new QuantitativeTest();
		myJunit.r = "test";
		EqualString("test", myJunit.r);
	}
	@Test
	public void assertSame() {
		int [] original= new int[3];
		
		original[0] = 0;
		original[1] = 1;
		original[2] = 2;
		
		int refA = original[2];
		int refB = original[2];
		
		if(refA == refB){
			System.out.println("The references are the same");
		}	
	}	
	@Test
	public void assertNotSame() {
	int [] original= new int[3];
		
		original[0] = 0;
		original[1] = 1;
		original[2] = 2;
		
		int refA = original[2];
		int refB = original[1];
		
		if(refA != refB){
			System.out.println("The references are NOT the same");
		}
	}
	@Test
	public void assertSameSecond(){
		int [] original= new int[3];
		
		original[0] = 0;
		original[1] = 1;
		original[2] = 2;
		
		int refA = original[2];
		int refB = original[2];
		checkSame(refA, refB);
	}
	
	
	/* Testing nulls */
	@Test
	public void assertNull() {
		int[] obj = new int [5];
		obj = null; 
		
		nullTester(obj);
	}
	@Test
	public void assertIsNotNull() {
		String stringTest = "Hello world";
		
		if(stringTest != null) {
			System.out.println("Not Null, string contains: " + stringTest);
		}
	}

	
	
	
	
	private void checkSame(int a, int b) {
		if(a == b){
			System.out.println("The references are the same");
		} else {
			System.out.println("The references are NOT the same");
		}
	}
	
 	private void EqualString(String compareThis, String shouldBeThis) {
		if(compareThis == shouldBeThis) {
			System.out.println("Strings are the same");
		}
	}
	
	private void nullTester(int[] array) {
		if(array == null) {
			System.out.println("Is null");
		}
	}
	
	private int[] createIntArrayA() {
	

		int[] A = new int[2];

		A[0] = 3;
		A[1] = 3;
		
		return A;
	}

	private int[] createIntArrayB() {

		int[] B = new int[2];

		B[0] = 3;
		B[1] = 3;
		
		return B;
	}

	private void arrayEquals(int[] a, int[] b) {

		if (a[0] == b[0] && a[1] == b[1]) {
			System.out.println("arrays are the same");
		} else {
			System.out.println("arrays are not the same");
		}
	}

	private void arrayEqualsSecond(int[] a, int[] b){
		int i = 0;
		if(a.length == b.length){
			while(i < a.length){
				if(a[i] == b[i]){
					System.out.println("Items are the same");
					i++;
				} else {
					System.out.println("Arrays are not the same");
					i = a.length + 1;
				}
			} 
		} else {
			System.out.println("Arrays are not the same");
		}
	}
}