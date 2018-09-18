package com.test;

import org.testng.annotations.Test;

public class Newtest2 {

@Test(priority=2)
public void testregistration() {
	System.out.println("registration");
}
	
@Test(priority=1)
public void testlogin() {
	System.out.println("login");
}
	
	
}
