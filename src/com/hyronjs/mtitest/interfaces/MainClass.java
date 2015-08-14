package com.hyronjs.mtitest.interfaces;

public class MainClass {

	public static void main(String[] args) {

		//System.out.println(args[0]);
		//----->Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		//      at com.hyronjs.mtitest.interfaces.MainClass.main(MainClass.java:7)

		Isuper isuper = new sub();
		System.out.println(isuper.toString());
	}
}
