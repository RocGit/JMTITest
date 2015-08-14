package com.hyronjs.mtitest;

public class ExceptionTest extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2989125556563742468L;

	public ExceptionTest() {
		// TODO Auto-generated constructor stub
	}
	
	public ExceptionTest(String msg, Throwable cause) {
		// TODO Auto-generated constructor stub
	}
	
	public ExceptionTest(Throwable cause) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			System.out.println("aaa");
			int i = 10/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				throw new ExceptionTest("this is my excption", new Throwable());
			} catch (ExceptionTest e1) {
				System.out.println(e1.getMessage().toString());
				e1.printStackTrace();
			}
		}
		
	}
	
	public void aaa() throws Exception {

	}

	
}
