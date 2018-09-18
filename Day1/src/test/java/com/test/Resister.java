package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Resister {
	
	@Test
	public void register() {
		
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.get("http://newtours.demoaut.com/"); 
		//linktext
		driver.findElement(By.linkText("REGISTER")).click(); 
	}
	

}
