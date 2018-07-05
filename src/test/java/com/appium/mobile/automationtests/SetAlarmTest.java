package com.appium.mobile.automationtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SetAlarmTest {
	
@Test
	
	public void alarmtest() throws MalformedURLException, InterruptedException
	{
		//dial number class deleted check
	
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("automation name", "Appium");
		dc.setCapability("platform", "Android");
		
		//dc.setCapability("platform", System.getProperty("PlatformName"));
		//dc.setCapability("platform", System.getProperty("PlatformVersion"));
		
		//To run on emulator
		//dc.setCapability("deviceName", "t1");//emulator name or keep as android emulator
		//dc.setCapability("platformVesion", "5.0.1");
		
		//To run on Nexus 6p device
		dc.setCapability("deviceName", "Galaxy On7 Pro");
		dc.setCapability("platformVesion", "6.0.1");
		
		
		////for emulator
		//**The below two lines is for testing the alarm clock app using appium
		//dc.setCapability("appPackage", "com.android.deskclock");
		//dc.setCapability("appActivity", "DeskClock");
		
		//for Nexus 6p device
		dc.setCapability("appPackage", "com.google.android.deskclock");
		dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
		Thread.sleep(5000);
	//Making the script create a alarm
	driver.findElementByXPath(("//android.widget.TextView[@text='Alarm']")).click();
	
	driver.findElementByXPath(("//android.widget.ImageButton[contains(@resource-id,'fab')]")).click();
	
	//finding by xpath didnt work
	//iver.findElementByXPath(("//android.widget.RadialTimePickerView[contains@index='1']")).click();
	//driver.findElementByXPath(("//android.widget.RadialTimePickerView$RadialPickerTouchHelper[@content-desc='1']")).click();

	//finding by uiselector class worked
	driver.findElementByAndroidUIAutomator("UiSelector().description(\"1\")").click();
	driver.findElementByAndroidUIAutomator("UiSelector().description(\"0\")").click();
	driver.findElement(By.id("android:id/button1")).click();
	
	
	
	
	}
	

}
