package com.vikrant.test.framework.hybrid.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {
	

	@Parameters("name")
	@Test(priority=-1, groups="grp1")
	public static void ctest(@Optional("No one ") String str){
		System.out.println("This is test C");
		System.out.println("Input parameter is: "+str);
	}
	
	@Test(groups="grp2", dataProvider="dataSource1", dataProviderClass=DP.class)	
	public static void btest(String id, String name){
		System.out.println("This is test B");
		System.out.println("Id is: "+id+" and name is: "+name);
		
	}
	
	@Test(groups="grp3")
	public static void atest(){
		System.out.println("This is test A");
	}
	
}
