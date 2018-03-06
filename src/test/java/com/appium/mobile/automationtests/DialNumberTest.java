package com.appium.mobile.automationtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DialNumberTest {
	
@Test
	
	public void testLaunchBrowser() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("automation name", "Appium");
		dc.setCapability("platform", "Android");
		dc.setCapability("deviceName", "Emulator");//emulator name or keep as android emulator
		dc.setCapability("platformVesion", "5.0.1");
		// *****The below two lines were for testing on chrome browser***
		//dc.setCapability("appPackage", "com.android.chrome");
		//dc.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		
		//**The below two lines is for testing the phone dialing using appium
		dc.setCapability("appPackage", "com.android.dialer");
		dc.setCapability("appActivity", "DialtactsActivity");
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//driver.get("http://www.gmail.com");
		//JavascriptExecutor je = (JavascriptExecutor)driver;
		//System.out.println(je.executeScript("return navigator.userAgent; ", new Object[0]));
		Thread.sleep(5000);
		//driver.quit();
		
		
		driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
		
		//Inputting Mobile number
		Scanner input =new Scanner(System.in);  //In this statement we create an object of a Scanner class which is define in import java.util.scanner package.
		
		System.out.println("Enter mobile number");
		
		int phonenumber = input.nextInt(); //Now accessing the nextInt() method of scannner class through the object made in the above line
		
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		while(phonenumber>0)
	   {
		stack.push(phonenumber%10);
		phonenumber = phonenumber/10;
			
		}
		

		while(!stack.isEmpty())
	   {
		switch(stack.pop())
		{
		
		case 1:
			driver.findElement(By.id("com.android.dialer:id/one"));
			break;
			
		case 2:

			driver.findElement(By.id("com.android.dialer:id/two")).click();

			break;

			case 3:

			driver.findElement(By.id("com.android.dialer:id/three")).click();

			break;

			case 4:

			driver.findElement(By.id("com.android.dialer:id/four")).click();

			break;

			case 5:

			driver.findElement(By.id("com.android.dialer:id/five")).click();

			break;

			case 6:

			driver.findElement(By.id("com.android.dialer:id/six")).click();

			break;

			case 7:

			driver.findElement(By.id("com.android.contacts:id/seven")).click();

			break;

			case 8:

			driver.findElement(By.id("com.android.dialer:id/eight")).click();

			break;

			case 9:

			driver.findElement(By.id("com.android.dialer:id/nine")).click();

			break;

			case 0:

			driver.findElement(By.id("com.android.dialer:id/zero")).click();

			break;

			default:

			break;

			}

			}

			driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();

			driver.quit();
			
	
		
	}
	
}