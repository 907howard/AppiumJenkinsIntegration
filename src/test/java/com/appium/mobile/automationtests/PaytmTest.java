package com.appium.mobile.automationtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;


public class PaytmTest {
	
	
	
@Test
	
	public void test1() throws MalformedURLException, InterruptedException
	{
		//dial number class deleted check
	
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("automation name", "Appium");
		dc.setCapability("platform", "Android");
		dc.setCapability("deviceName", "Galaxy On7 Pro");
		dc.setCapability("platformVesion", "6.0.1");
		
		dc.setCapability("appPackage", "net.one97.paytm");
		dc.setCapability("appActivity", "landingpage.activity.AJRMainActivity");
		dc.setCapability("noReset", true);
		
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
	
    	driver.findElementByXPath(("//*[contains(@resource-id,'net.one97.paytm:id/btn_language_continue_button')]")).click();
    
	//for handling initial location accessing alert
	    
    	if(driver.findElement(By.className("android.widget.FrameLayout")).isDisplayed());
    	{
    	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
      	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
      	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
    	}
    	
    	
    
    	driver.findElement(By.id("net.one97.paytm:id/text_input_email")).sendKeys("9740232254");
    	Thread.sleep(3000L);
    	driver.findElement(By.id("net.one97.paytm:id/text_input_password")).sendKeys("metr02033");
    	Thread.sleep(3000L);
    	
    	driver.findElementByXPath(("//*[contains(@resource-id,'net.one97.paytm:id/lyt_sign_in_button')]")).click();
    	
    	//now handling otp verification manually
    	
    	
    	
	}
	

}
