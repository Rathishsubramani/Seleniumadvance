package com.test;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day6new {

	@BeforeTest
	public void beforeTest() {
		System.out.println("openbrowser");
	}
	
	@Test(priority=1)
	public void launchapp() {
		System.out.println("app launch");
		Assert.assertEquals(12, 13);
	}
	@Test(priority=2,dependsOnMethods="launchapp")
	public void login() {
		System.out.println("login");
	}
	@Test(priority=2,dependsOnMethods="login")
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterTest
	public void afterTest() {
		
	}
}
