package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Newtest3 {


@Test
public void testchrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\r.c.subramani\\Downloads\\WebDriver\\WebDriver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
}
@Test
public void testfirefox() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\r.c.subramani\\Downloads\\WebDriver\\WebDriver\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
}
@Test
public void testie() {
	System.setProperty("webdriver.ie.driver","C:\\Users\\r.c.subramani\\Downloads\\WebDriver\\WebDriver\\IEDriverServer.exe");
	InternetExplorerDriver driver =new InternetExplorerDriver();
}


}