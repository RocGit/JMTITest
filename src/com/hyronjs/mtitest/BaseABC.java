package com.hyronjs.mtitest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseABC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("%\t" + 17%5);
		
		float f1 = 1.0f;
		float f2 = .57f;
		System.out.println("float\t" + (f1 + f2));
		
		int [] a = {10, 20, 30};
		int [] b;
		b = a;
		b[0] = 1;
		System.out.println( "a[0] = " + a[0] + ", b[0] = " + b[0] );
		System.out.println("a==b\t" + (a==b));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for (Integer integer : list) {
			System.out.println("forEach--->\t" + integer);
		}
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println("For Iterator\t" + integer);
		}
		
	}

}
