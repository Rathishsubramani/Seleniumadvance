package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newtest4 {
	
	@Test
	public void google()
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\r.c.subramani\\Downloads\\WebDriver\\WebDriver\\chromedriver.exe"); 
	//WebDriver driver= new ChromeDriver();
		WebDriver driver=DriverUtility.getDriver("chrome"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/"); 
	//name
    driver.findElement(By.name("userName")).sendKeys("Mercury");  
    driver.findElement(By.name("password")).sendKeys("mercury");
    driver.findElement(By.name("login")).click();
 
    driver.getTitle();
    Assert.assertEquals(driver.getTitle(),"Find a Flight: Mercury Tours:");
   //or string title =driver.getTitle();
   //Assert.assertEquals(title,"Find a Flight: Mercury Tours");
  //cssselector
   driver.findElement(By.cssSelector("input[value='oneway']")).click(); 
   WebElement from = driver.findElement(By.name("fromport"));
  
   Select sel= new Select(from);
   //sel.selectByIndex(0);
   //sel.selectByValue(arg0);
   List<WebElement> list = sel.getOptions();
   System.out.println(list.size());
   Assert.assertEquals(list.size(),10);
  // for(WebElement e:list)
  // {
	 //  System.out.println(e.getText());  
  // }
   
   for(WebElement e: list) {
	   String city=e.getText();
	   if(city.equals("Paris"))
	   {
		   sel.selectByVisibleText(city);
		   break;
	   }
   }
}  
}


