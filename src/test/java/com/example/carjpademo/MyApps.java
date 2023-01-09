package com.example.carjpademo;

public class MyApps {

	public int getAverage(int arr[]) {
		int sum = 0;
		int length = arr.length;
		for(int i = 0; i < length; i++) {
			sum += arr[i];
		}
		return sum/length;
	}
	
	public int findCube(int n) {
		return n * n * n;
	}
	
	public int findIndexOf(String str, char ch) {
		return str.indexOf(ch);
	}
	
	public String myConcat(String s1, String s2) {
		return s1+" "+s2;
	}
}
