package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class day6efe {
 WebDriver driver;
 @BeforeTest
 public void beforeTest() {
	     driver=DriverUtility.getDriver("chrome"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
 }
 
 @Test(priority=1)
 public void launchapps() {
	 driver.get("http://newtours.demoaut.com/");
	 List<WebElement> list= driver.findElement(By.tagName("a"));
	 System.out.println(list.size());
 }
	
}
