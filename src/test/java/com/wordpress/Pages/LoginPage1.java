/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jenny howard
 *
 *This class will store all the locators and methods of login page
 *
 */
public class LoginPage1 {
	
	WebDriver driver;
	
	
	By username = By.id("user_login");
	
	
	By password = By.xpath(".//*[@id='user_pass']");
	
	By LoginButton = By.name("wp-submit");
	

	
	public LoginPage1(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	//Either this one single method can be called or the the individual methods given below this, either of these can be commented
	public void loginToWordpress(String uid,String pwd)
	{
		
		
		driver.findElement(username).sendKeys(uid);
		
		driver.findElement(password).sendKeys(pwd);
		
		
	}

	
	
////////////// OR the givem below methods
	
	
	public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys(uid);
		
	}
	

	public void typePassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
		
	}
	

	public void clickLoginButton()
	{
		driver.findElement(LoginButton).click();
		
	}

}
