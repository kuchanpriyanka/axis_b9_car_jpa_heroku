package com.example.carjpademo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyUtilityTest {

	@Test //Indicates following method is a unit test case
	public void myStringLengthTest() {
		MyUtilityClass util = new MyUtilityClass();
		assertEquals(8, util.myStringLength("Priyanka"));
		//first parameter is expected output, second is actual o/p
	}
	
	@Test
	public void myUpperCaseTest() {
		MyUtilityClass util = new MyUtilityClass();
		assertEquals("AXIS", util.myUpperCase("axis"));
	}
	
	@Test
	public void addTest() {
		MyUtilityClass util = new MyUtilityClass();
		assertEquals(10, util.add(4,6));
	}
	
	@Test
	public void isPrimeTest() {
		MyUtilityClass util = new MyUtilityClass();
		assertTrue(util.isPrime(13));
		assertFalse(util.isPrime(100));
	}
}
