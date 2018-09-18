package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NewTest6 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Beforemethod() {
		
		driver =DriverUtility.getDriver("chrome");
		System.out.println("Beforemethod");
	}
	
    @AfterMethod
	public void Aftermethod() {
		
		 driver.close();
		 System.out.println("Aftermethod");
	}
	
  @Test
  public void testgoogle() {
	  
	 //WebDriver driver =DriverUtility.getDriver("chrome");
	  driver.get("https://www.google.co.in/");
	 // driver.close();
  }
  
  @Test
  public void testnewtour() {
		//WebDriver driver=DriverUtility.getDriver("chrome"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/"); 
		// driver.close();
  }
}