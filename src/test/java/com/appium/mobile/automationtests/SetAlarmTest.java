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
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("automation name", "Appium");
		dc.setCapability("platform", "Android");
		dc.setCapability("deviceName", "t1");//emulator name or keep as android emulator
		dc.setCapability("platformVesion", "5.0.1");
		
		//**The below two lines is for testing the alarm clock app using appium
		dc.setCapability("appPackage", "com.android.deskclock");
		dc.setCapability("appActivity", "DeskClock");
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
		Thread.sleep(5000);
		//driver.quit();
	
		driver.findElement(By.id("android:id/action_bar_container"));
		
		driver.findElement(By.className("android.app.ActionBar$Tab"));
		
		driver.findElement(By.className("android.widget.ImageView")).click();
	
	
	//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.FrameLayout\").resourceId(\"android:id/action_bar_container\")");
	
	//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.FrameLayout\").description(\"Alarm\")").click();
	
		
		
	//driver.findElement(By.className("android.widget.ListView")).findElement(By.id("com.android.deskclock:id/alarms_list"));
	
	//driver.findElement(By.className("android.widget.LinearLayout"));
	//driver.findElement(By.className("android.widget.ImageButton")).findElement(By.id("com.android.deskclock:id/fab")).click();

	
	
	
	}
	

}
