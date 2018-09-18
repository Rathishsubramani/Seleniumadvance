package com.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hdfc {

WebDriver driver;
	
	@BeforeTest
	public void beforeetst() {
		WebDriver driver=DriverUtility.getDriver("chrome"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/"); 
	}
	
	@Test
	public void hdfc() {
		driver.findElement(By.linkText("Credit Card")).click();
		Set<String> set=driver.getWindowHandles();
		   System.out.println(set.size());
			for(String w:set) {
				driver.switchTo().window(w);
				}
			driver.findElement(By.className("home-customer-image")).click();
			Set<String> set=driver.getWindowHandles();
			   System.out.println(set.size());
				for(String w:set) {
					driver.switchTo().window(w);
					}	

				Actions act = new Actions(driver);
				WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'Enter Mobile Number')]"));
				act.moveToElement(e1).perform();
				
				
		/*Actions act = new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'AboutUS')]"));
		act.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.xpath("//span[contains(text(),'Our Offices')]"));
		act.moveToElement(e2).perform();
		WebElement e3=driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));
		act.moveToElement(e3).perform();*/
		//String w=driver.getWindowHandle();
		//System.out.println(w);
		//driver.getWindowHandles(); all address
	   Set<String> set=driver.getWindowHandles();
	   System.out.println(set.size());
		for(String w:set) {
			driver.switchTo().window(w);
			
		}
		WebElement f=driver.findElement(By.name("main_page"));
		driver.switchTo().frame(f);
		
		String addr =driver.findElement(By.id("demo3")).getText();
		System.out.println(addr);
	}
	@AfterTest
	
	public void aftertest()
	{
		driver.quit();
	}

}
