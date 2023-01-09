package com.example.carjpademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MyAppsTest {

	private MyApps app;
	
	@BeforeEach
	public void init() {
		app = new MyApps();
		System.out.println("Before Testcase..");
	}
	@Test
	public void getAverageTest() {
		int arr[] = {3,4,5,6,7};
		assertEquals(5, app.getAverage(arr));
	}
	
	@Test
	public void cubeTest() {
		assertEquals(27, app.findCube(3));
	}
	
	@Test
	public void indexTest() {
		assertEquals(3, app.findIndexOf("axis",'s'));
	}
	
	@Disabled //ignore a test case
	@Test
	public void concactTest() {
		assertEquals("Axis Bank", app.myConcat("Axis", "Bank"));
	}
	
	@AfterEach
	public void after() {
		System.out.println("After Testcase..");
	}
	
}
