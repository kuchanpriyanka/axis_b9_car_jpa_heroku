package com.example.carjpademo;

public class MyUtilityClass {

	//module 1
	public int myStringLength(String str) {
		return str.length();
	}
	
	//module 2
	public String myUpperCase(String str) {
		return str.toUpperCase();
	}
	
	//module 3
	public int add(int a ,int b) {
		return a + b;
	}
	
	//module 4
	public boolean isPrime(int num) {
		for(int i = 2; i < num / 2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
