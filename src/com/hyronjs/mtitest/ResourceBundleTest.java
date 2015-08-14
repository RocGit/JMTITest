package com.hyronjs.mtitest;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("myres");
		System.out.println(bundle.getString("aaa"));
		
		Locale locale = new Locale("ja","JP");
		 bundle = ResourceBundle.getBundle("myres",locale);
	}

}
