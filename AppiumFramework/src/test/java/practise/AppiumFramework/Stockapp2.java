package practise.AppiumFramework;


import java.io.IOException;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;


public class Stockapp2 extends base{

	@Test
	public void StockValidation() throws IOException, InterruptedException
	{
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("stockapp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//*[@text='I ACCEPT THE TERMS']")).click();
	     driver.findElement(By.xpath("//*[@text='ANONYMOUS LOGIN']")).click();
	     driver.findElement(By.xpath("//*[@text='India']")).click();
	     driver.findElement(By.xpath("//*[@text='SELECT']")).click();
	     driver.findElement(By.xpath("//*[@text='OK']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@text='Find Stocks']")).click();
	     driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Reliance");
	     driver.hideKeyboard();
	     driver.findElement(By.xpath("//*[@text='Reliance Industries Limited']")).click();
	    // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Show\"));");
	     driver.findElement(By.xpath("//*[@text='WATCH']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElementByClassName("android.widget.ImageView").click();
	     
	     driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("HDFC");
	     driver.hideKeyboard();
	     driver.findElement(By.xpath("//*[@text='HDFC Bank Limited']")).click();
	    // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SELL\"));");
	     driver.findElement(By.xpath("//*[@text='WATCH']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElementByClassName("android.widget.ImageView").click();
	     driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Maruti");
	     driver.hideKeyboard();
	     driver.findElement(By.xpath("//*[@text='Maruti Suzuki India Limited']")).click();
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SELL\"));");
	     driver.findElement(By.xpath("//*[@text='WATCH']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElementByClassName("android.widget.ImageView").click();
	     driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Polycab");
	     driver.hideKeyboard();
	     driver.findElement(By.xpath("//*[@text='Polycab India Limited']")).click();
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SELL\"));");
	     driver.findElement(By.xpath("//*[@text='WATCH']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Watchlist\"));");
	     driver.findElement(By.xpath("//*[@text='Watchlist']")).click();
	     System.out.println( driver.findElement(By.xpath("//*[@text='RELIANCE']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='HDFCBANK']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='POLYCAB']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='MARUTI']")).isDisplayed());
	    
	}
}
