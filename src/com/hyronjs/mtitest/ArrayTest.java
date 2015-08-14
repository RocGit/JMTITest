package com.hyronjs.mtitest;

public class ArrayTest {

	public static void main(String[] args) {
		int a[] = {10, 20, 30};
		System.out.println("a[0]------>>" + a[0]);
		int b[];
		b = a;
		System.out.println("b[0]------>>" + b[0]);
		System.out.println("a == b---->>>" + (a == b));
		b[0] = 1;
		System.out.println("a[0]---->" + a[0] + "\tb[0]----->" + b[0]);
	}
}
