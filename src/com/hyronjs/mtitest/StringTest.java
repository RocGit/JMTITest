package com.hyronjs.mtitest;

public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("111");
		String s2 = new String("111");
		
		System.out.println("s1==s2---->>" + (s1 == s2));
		
		
		String s3 = "111";
		String s4 = "111";
		
		System.out.println("s3==s4---->>" + (s3 == s4));
	}

}
