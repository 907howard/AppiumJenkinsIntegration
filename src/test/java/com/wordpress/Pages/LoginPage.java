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
public class LoginPage {
	
	WebDriver driver;
	
	
	By username = By.id("user_login");
	
	
	By password = By.xpath(".//*[@id='user_pass']");
	
	By LoginButton = By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
		
	}
	

	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
		
	}
	

	public void clickLoginButton()
	{
		driver.findElement(LoginButton).click();
		
	}

}
