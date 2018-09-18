package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.LoginPage;

public class Newtest12 {
    WebDriver driver;
    LoginPage loginPage;
	@BeforeTest
	public void beforretest() {
		driver=DriverUtility.getDriver("chrome");
	    loginPage=PageFactory.initElements(driver,LoginPage.class);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	
	}
	
	
	@Test
	public void testLogin() {
		String title=loginPage.clicksignIn();
		Assert.assertTrue(title.contains("Flight"));
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		loginPage=null;
		
	}
	
}
