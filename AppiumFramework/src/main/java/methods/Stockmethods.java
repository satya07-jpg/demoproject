package methods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import pageObjects.StockButtons;
import pageObjects.portfolio;
import practise.AppiumFramework.base;

public class Stockmethods extends base {

	public void Login1() throws IOException, InterruptedException
	{
		
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	     driver.findElement(By.xpath("//*[@text='I ACCEPT THE TERMS']")).click();
	     driver.findElement(By.xpath("//*[@text='ANONYMOUS LOGIN']")).click();
	     driver.findElement(By.xpath("//*[@text='India']")).click();
	     driver.findElement(By.xpath("//*[@text='SELECT']")).click();
	     driver.findElement(By.xpath("//*[@text='OK']")).click();
		
		
	}

 
     public void Validation1() throws IOException, InterruptedException
{
	
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     System.out.println( driver.findElement(By.xpath("//*[@text='RELIANCE']")).isDisplayed());
     System.out.println( driver.findElement(By.xpath("//*[@text='HDFCBANK']")).isDisplayed());
     System.out.println( driver.findElement(By.xpath("//*[@text='POLYCAB']")).isDisplayed());
     System.out.println( driver.findElement(By.xpath("//*[@text='MARUTI']")).isDisplayed());
	
}
     public void Validation2() throws IOException, InterruptedException
     {
     	
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          System.out.println( driver.findElement(By.xpath("//*[@text='RELIANCE - Reliance Industries Limited']")).isDisplayed());
 	     System.out.println( driver.findElement(By.xpath("//*[@text='HDFCBANK - HDFC Bank Limited']")).isDisplayed());
     	
     }
     public void BuyStocks() throws IOException, InterruptedException
 	{
 		
 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	    portfolio p = new portfolio(driver);
 	   StockButtons s = new StockButtons(driver);

 	    p.rels.click();
	     p.buybtn.click();
	     p.nos.sendKeys("2");
	     p.buybtn.click();
	     s.imagebtn.click();
	     p.hdfcs.click();
	     p.buybtn.click();
	     p.nos.sendKeys("2");
	     p.buybtn.click();
	     s.imagebtn.click();
 		
 		
 	}
     public void SellStocks() throws IOException, InterruptedException
 	{
 		
 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	    portfolio p = new portfolio(driver);
  	   StockButtons s = new StockButtons(driver);
 		
 	    p.sellrel.click();
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    p.nos.sendKeys("2");
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    driver.findElement(By.xpath("//*[@text='WATCH AD']")).click();
	    Thread.sleep(10000);
	    driver.pressKeyCode(AndroidKeyCode.BACK);
	    s.imagebtn.click();
	    p.sellrel.click();
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    p.nos.sendKeys("2");
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    s.imagebtn.click();
	    p.sellhdfc.click();
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    p.nos.sendKeys("2");
	    driver.findElement(By.xpath("//*[@text='SELL']")).click();
	    s.imagebtn.click();
 		
 		
 	}

}