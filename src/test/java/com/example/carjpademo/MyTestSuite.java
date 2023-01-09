package com.example.carjpademo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MyUtilityTest.class,MyAppsTest.class})
//@Selectpackages({...})
public class MyTestSuite {
	
}
