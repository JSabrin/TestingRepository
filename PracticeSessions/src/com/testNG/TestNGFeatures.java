package com.testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest(){
		System.out.println("login test");
		//int i = 9/0; //ArithmeticException so homePageTest method will be skips at moment
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest(){
		System.out.println("Home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest(){
		System.out.println("Search page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("Registration page test");
	}
	
	
	
	
	
}
