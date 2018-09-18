package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	//data----------web element
	WebDriver driver;
	@FindBy(how=How.NAME,using="userName")
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.NAME,using="login")
	WebElement signIn;
	//method--------Fun(login)
	//constructor--
 public String clicksignIn() {
	 username.sendKeys("mercury");
	 password.sendKeys("mercury");
	 signIn.click();
     return driver.getTitle();
 
 }
public LoginPage(WebDriver driver) {
	super();
	this.driver = driver;
}
}
