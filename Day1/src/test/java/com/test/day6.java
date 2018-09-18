package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dataprovider.LoginDataProvider;

public class day6 {
	 
	WebDriver driver;
	 @Parameters("browser")
	 @BeforeTest
	 //before method open browser two time,before test one time
	  public void beforetest(String v1) {
		driver =DriverUtility.getDriver(v1);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 driver.get("http://newtours.demoaut.com/"); 
	  }
	 @AfterTest
	  public void Aftertest() {
		driver.close();
	  }
		@Test(dataProvider="dp1", dataProviderClass=LoginDataProvider.class) 
	 public void testnewtour(String userID,String password)
	 {
	
	
    driver.findElement(By.name("userName")).sendKeys(userID);  
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("login")).click();
    Assert.assertTrue(driver.getTitle().contains("Flight"));
	if(driver.getTitle().contains("Flight")) {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	 }
 
	 @DataProvider()
	public Object[][] getData(){
		Object[][]obj= {
				{"mercury","mercury"},
				{"Test123","Pass123"}
		};
		
		return obj;
		
//or
		//@Test(dataProvider="dp")	
		 //@DataProvider(name="dp")
		
		
	 }

}
