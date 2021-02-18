package practise.AppiumFramework;


import java.io.IOException;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import methods.Stockmethods;
import pageObjects.Login;
import pageObjects.StockButtons;
import pageObjects.portfolio;
import pageObjects.watchlist;


public class Stockapp4 extends base{

	@Test
	public void StockValidation() throws IOException, InterruptedException
	{
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Satyawand\\Desktop\\appium\\framework\\AppiumFramework\\excel\\data1.xlsx");
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("stockapp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    

	     Stockmethods mn = new Stockmethods();
	     mn.Login1();
	     Thread.sleep(1000);
	     StockButtons s = new StockButtons(driver);
	     watchlist w = new watchlist(driver);
	     w.findst.click();
	     w.search.sendKeys(excel.getData(0, 1, 0));
	     driver.hideKeyboard();
	     w.rel.click();
	     s.watchbtn.click();
	     s.imagebtn.click();
	     w.imgview.click();
	     w.search.sendKeys(excel.getData(0, 2, 0));
	     driver.hideKeyboard();
	     w.hdfc.click();
	     s.watchbtn.click();
	     s.imagebtn.click();
	     w.imgview.click();
	     w.search.sendKeys(excel.getData(0, 3, 0));
	     driver.hideKeyboard();
	     w.maruti.click();
	     s.watchbtn.click();
	     s.imagebtn.click();
	     w.imgview.click();
	     w.search.sendKeys(excel.getData(0, 4, 0));
	     driver.hideKeyboard();
	     w.polycab.click();
	     s.watchbtn.click();
	     s.imagebtn.click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Watchlist\"));");
	     driver.findElement(By.xpath("//*[@text='Watchlist']")).click();
	     mn.Validation1();
	     portfolio p = new portfolio(driver);
	     mn.BuyStocks();
	     driver.findElement(By.xpath("//*[@text='Portfolio']")).click();
	     mn.Validation2();
	    s.imagebtn.click();
	    p.Myaccount.click();
	   System.out.println( driver.findElement(By.id("com.alifesoftware.stocktrainer:id/totalPortfolioValue")).getText());
	    s.imagebtn.click();
	    driver.findElement(By.xpath("//*[@text='Portfolio']")).click();
	    mn.SellStocks();
	    driver.findElementByXPath("//*[@content-desc='Open navigation drawer']").click();
	    p.Myaccount.click();
	    System.out.println( driver.findElement(By.id("com.alifesoftware.stocktrainer:id/totalPortfolioValue")).getText());
}
}
