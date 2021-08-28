package com.vikrant.test.framework.hybrid.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest {
	

	
	@BeforeClass
	public void BC(){
		System.out.println("Second - Method BC");
	}
	
	@BeforeMethod
	public void BM(){
		System.out.println("Second - Method BM");
	}
	
	@Test
	public void a(){
		System.out.println("Second - This is method A");
	}
	
	@Test
	public void b(){
		System.out.println("Second - Method B");
	}
	
	@Test
	public void d(){
		System.out.println("Second - Method d");
	}
	
	@Test
	public void c(){
		System.out.println("Second - Method c");
	}
	
	@AfterMethod
	public void AM(){
		System.out.println("Second - Method AM");
	}

	
	@AfterClass
	public void AC(){
		System.out.println("Second - Method AC");
	}
	
	


}
