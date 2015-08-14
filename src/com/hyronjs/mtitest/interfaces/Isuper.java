package com.hyronjs.mtitest.interfaces;

public interface Isuper {
	
	static final String AAA = "";
	public void aaa();
	public String toString();
	
	

}


class sub implements Isuper{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String string = this.getClass().toString();
		System.out.println("override the toString-->\t" + string);
		return super.toString();
	}
	
	
}
