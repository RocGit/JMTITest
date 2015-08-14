package com.hyronjs.mtitest;

public class MultiClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Child();
		f.say();
		Father f2 = new Father();
		f2.say();
	}

}
class Father{
	
	public void say() {
		System.out.println("I'm the father!");
	}
}

class Child extends Father{
	public void say() {
		System.out.println("I'm the child!");
	}
	public void runs() {
		System.out.println("I'm running!");
	}
}