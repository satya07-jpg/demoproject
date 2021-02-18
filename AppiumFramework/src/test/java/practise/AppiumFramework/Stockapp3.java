package practise.AppiumFramework;


import java.io.IOException;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import methods.Stockmethods;
import pageObjects.Methods;


public class Stockapp3 extends base{
	
	//@DataProvider
	//public Object[][] getStockData() {
		//Object data[][] = TestUtil.getTestData("login");
		//return data;
	

	//@Test(dataProvider="getStockData")

     

	public void StockValidation() throws IOException, InterruptedException
	{
		
        ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Satyawand\\Desktop\\appium\\framework\\AppiumFramework\\excel\\data1.xlsx");
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("stockapp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	     Stockmethods mn = new Stockmethods();
	     mn.Login1();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@text='Find Stocks']")).click();
	     driver.findElement(By.xpath("//*[@text='Search']")).sendKeys(excel.getData(0, 1, 0));
	     driver.hideKeyboard();
	     driver.findElement(By.xpath(excel.getData(0, 1, 1))).click();
	    // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Show\"));");
	     driver.findElement(By.xpath("//*[@text='WATCH']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElementByClassName("android.widget.ImageView").click();	     
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Watchlist\"));");
	     driver.findElement(By.xpath("//*[@text='Watchlist']")).click();
	     System.out.println( driver.findElement(By.xpath("//*[@text='RELIANCE']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='HDFCBANK']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='POLYCAB']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='MARUTI']")).isDisplayed());
	     driver.findElement(By.xpath("//*[@text='RELIANCE']")).click();
	     driver.findElement(By.xpath("//*[@text='BUY']")).click();
	     driver.findElement(By.xpath("//*[@text='Number of Stocks']")).sendKeys("2");
	     driver.findElement(By.xpath("//*[@text='BUY']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElement(By.xpath("//*[@text='HDFCBANK']")).click();
	     driver.findElement(By.xpath("//*[@text='BUY']")).click();
	     driver.findElement(By.xpath("//*[@text='Number of Stocks']")).sendKeys("2");
	     driver.findElement(By.xpath("//*[@text='BUY']")).click();
	     driver.findElementByClassName("android.widget.ImageButton").click();
	     driver.findElement(By.xpath("//*[@text='Portfolio']")).click();
	     System.out.println( driver.findElement(By.xpath("//*[@text='RELIANCE - Reliance Industries Limited']")).isDisplayed());
	     System.out.println( driver.findElement(By.xpath("//*[@text='HDFCBANK - HDFC Bank Limited']")).isDisplayed());
	    driver.findElementByClassName("android.widget.ImageButton").click();
	    driver.findElement(By.xpath("//*[@text='My Account']")).click();
	   System.out.println( driver.findElement(By.id("com.alifesoftware.stocktrainer:id/totalPortfolioValue")).getText());
	    driver.findElementByClassName("android.widget.ImageButton").click();
	    driver.findElement(By.xpath("//*[@text='Portfolio']")).click();
	    driver.findElement(By.xpath("//*[@text='RELIANCE - Reliance Industries Limited']")).click();
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElement(By.xpath("//*[@text='Number of Stocks']")).sendKeys("2");
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElement(By.xpath("//*[@text='WATCH AD']")).click();
	    Thread.sleep(10000);
	    driver.pressKeyCode(AndroidKeyCode.BACK);
	    driver.findElementByClassName("android.widget.ImageButton").click();
	    driver.findElement(By.xpath("//*[@text='RELIANCE - Reliance Industries Limited']")).click();
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElement(By.xpath("//*[@text='Number of Stocks']")).sendKeys("2");
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElementByClassName("android.widget.ImageButton").click();
	    driver.findElement(By.xpath("//*[@text='HDFCBANK - HDFC Bank Limited']")).click();
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElement(By.xpath("//*[@text='Number of Stocks']")).sendKeys("2");
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElementByClassName("android.widget.ImageButton").click();
	    driver.findElementByXPath("//*[@content-desc='Open navigation drawer']").click();
	    driver.findElement(By.xpath("//*[@text='My Account']")).click();
	    System.out.println( driver.findElement(By.id("com.alifesoftware.stocktrainer:id/totalPortfolioValue")).getText());
}
}
