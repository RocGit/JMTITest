package com.hyronjs.mtitest;

public class RunExceptionTest {
	static String s = "";

	public static void main(String[] args) {

		try {
			doSub();
		} catch (Exception e) {
			System.out.println(s += "A");
		}
	}

	static void doSub() throws RuntimeException {

		try {
			s += "B";
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			s += "C";
			throw new IllegalArgumentException();
		}
	}

}
