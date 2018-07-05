package com.appium.mobile.automationtests;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;


public class AmazonTest {
	
@Test
	
	public void test1() throws MalformedURLException, InterruptedException
	{
		//dial number class deleted check
	final  String appLocation = "C:\\Users\\jenny howard\\Downloads";
	final  String appName ="com.amazon.mShop.android-5.2.0@APK4Fun.com.apk";
	
  

 
    //relative path to apk file
   // File classpathRoot = new File(System.getProperty("user.dir"));
   File appDir = new File(appLocation);
   File app = new File(appDir, appName);
 
    //setting up desired capability
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("automationName", "appium");
    caps.setCapability("platform", "ANDROID");
    caps.setCapability("platformVersion", "6.0.1");
    caps.setCapability("deviceName", "Galaxy On7 Pro");
    caps.setCapability("app", app.getAbsolutePath());
	
	
	//in.amazon.mshop.android.shopping/com.amazon.identity
	caps.setCapability("appPackage", "com.amazon.mShop.android");
    caps.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
	
 
    //initializing driver object
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

   

    //The below 3 lines also works perfectly
   // WebElement element = driver.findElementByAndroidUIAutomator("new UiSelector().index(5)");// finally fetching the element to click
   // assertEquals("android.widget.Button", element.getTagName());
   // element.click();//and this worked 
    
    //OR the below also can be used to click on the element
    
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(5)").click();
    
    
    driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'ap_email')]").sendKeys("xxx@gmail.com");
    driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'ap_password')]").sendKeys("xxxxx");
   // driver.hideKeyboard();
    driver.navigate().back();
    
    driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'signInSubmit')]").click();
	}

}
