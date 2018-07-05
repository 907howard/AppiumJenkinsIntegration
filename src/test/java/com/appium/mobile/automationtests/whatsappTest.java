package com.appium.mobile.automationtests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class whatsappTest {
	
	
@Test
	
	public void test1() throws MalformedURLException
	{
		//dial number class deleted check
	final  String appLocation = "C:\\Users\\jenny howard\\Downloads";
	final  String appName ="com.whatsapp_v2.18.103-452235_Android-4.0.3.apk";
	
  

 
    //relative path to apk file
   // File classpathRoot = new File(System.getProperty("user.dir"));
   File appDir = new File(appLocation);
   File app = new File(appDir, appName);
 
    //setting up desired capability
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("automationName", "appium");
    caps.setCapability("platform", "ANDROID");
    
    
	
	//To run on emulator
	//caps.setCapability("deviceName", "t1");//emulator name or keep as android emulator
	//caps.setCapability("platformVesion", "5.0.1");
    
    //*On real device
    caps.setCapability("platformVersion", "6.0.1");
    caps.setCapability("deviceName", "Galaxy On7 Pro");
   caps.setCapability("app", app.getAbsolutePath());
	
	
	//in.amazon.mshop.android.shopping/com.amazon.identity
	caps.setCapability("appPackage", "com.whatsapp");
    caps.setCapability("appActivity", "com.whatsapp.HomeActivity");
    caps.setCapability("appActivity", "com.whatsapp.Main");
    caps.setCapability("noReset", true);
    caps.setCapability("fullReset", false);
   
    //initializing driver object
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
/*
	
    //driver.findElement(By.id("com.whatsapp:id/eula_accept")).click();
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(3)").click();
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(1)").click();
	
    
    //For handling the two pop up alert box which ask for device permissions
    if(driver.findElement(By.className("android.widget.FrameLayout")).isDisplayed());
	{
	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
  	driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
  	
	}
    
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").index(1)").sendKeys("123456789");
    
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(3)").click();
    
    //For handling the  green alert box asking permission to continue auto detection of verification code from sms
   
    
    
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(1)").click();
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(1)").click();
    
    //For handling the alert pop up asking permission to read sms mesgs
    driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
    
    //for handling the screen which ask for restoring or skipping backup , so i slect skip here
    driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(1)").click();
    
   
	driver.findElement(MobileBy.id(" android:id/button1")).click();
	
	
  	
	
	//For typing the profile name
	  driver.findElementByXPath("//android.widget.EditText[contains(@resource-id,'com.whatsapp:id/registration_name')]").sendKeys("DJH");
	
    
	  driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(4)").click();
	  */
	}
}
