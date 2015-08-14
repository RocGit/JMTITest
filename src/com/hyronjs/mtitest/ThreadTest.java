package com.hyronjs.mtitest;


public class ThreadTest extends Thread {
	private String name;
	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	public ThreadTest(String name) {
		this.name = name;
	}
	
	

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("this A thread:" + i + this.name);
		}
	}
	
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		ThreadTest test2 = new ThreadTest("A");
		ThreadTest test3 = new ThreadTest("B");
		try {
			test.run();
			test2.start();
			test3.start();
			test2.start();
			test3.start();
			test2.start();
			test3.start();
			test2.start();
			test3.start();
			test2.start();
			test3.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread1 thread1 = new Thread1("aaaaa");
		Thread1 thread2 = new Thread1("bbbb");
		thread1.run();
		Thread thread = new Thread(thread1);
		Thread threadx = new Thread(thread2);
		thread.start();
		threadx.start();
	}
}
class Thread1 implements Runnable{
	private String name;

	public Thread1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("Runnable -->:\t" + this.name );
		
	}
	
}