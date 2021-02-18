package practise.AppiumFramework;


import java.io.IOException;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;


public class Stockapp extends base{

	@Test
	public void StockValidation() throws IOException, InterruptedException
	{
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("stockapp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//*[@text='I ACCEPT THE TERMS']")).click();
	     driver.findElement(By.xpath("//*[@text='New to Stock Trainer? Register Here']")).click();
	     driver.findElement(By.xpath("//*[@text='Full Name']")).sendKeys("Planit");
	     driver.findElement(By.xpath("//*[@text='Email']")).sendKeys("planittesting53@gmail.com");
	     driver.findElement(By.xpath("//*[@text='Password']")).sendKeys("Planit@123");
	     driver.findElement(By.xpath("//*[@text='Confirm Password']")).sendKeys("Planit@123");
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/countrySpinner")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
	     driver.findElement(By.xpath("//*[@text='India']")).click();
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/securityQuestionOne")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Your childhood nickname?\"));");
	     driver.findElement(By.xpath("//*[@text='Your childhood nickname?']")).click();
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/inputId_firstSecurityAnswer")).sendKeys("pratz");
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/securityQuestionTwo")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"What was the name of your first school?\"));");
	     driver.findElement(By.xpath("//*[@text='What was the name of your first school?']")).click();
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/inputId_secondSecurityAnswer")).sendKeys("St Xaviers");
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Already Registered? Click to Login\"));");
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/securityQuestionThree")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Your childhood hero?\"));");
	     driver.findElement(By.xpath("//*[@text='Your childhood hero?']")).click();
	     driver.findElement(By.id("com.alifesoftware.stocktrainer:id/inputId_thirdSecurityAnswer")).sendKeys("superman");
	     driver.findElement(By.xpath("//*[@text='REGISTER NEW ACCOUNT']")).click();
	     
}
}