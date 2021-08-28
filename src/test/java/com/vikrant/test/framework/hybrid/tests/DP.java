package com.vikrant.test.framework.hybrid.tests;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DP {

	@DataProvider(name="dataSource1")
	public static String[][] dataSource(Method m){
		System.out.println("Method name is: "+m);
		String[][] data = new String[2][2];
		data[0][0] = "id";
		data[0][1] = "name";
		data[1][0] = "1";
		data[1][1] = "vikrant";
		return data;
		
	}
	
	
	

}
