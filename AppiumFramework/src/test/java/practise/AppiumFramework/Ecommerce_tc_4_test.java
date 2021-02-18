package practise.AppiumFramework;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckoutPage;
import pageObjects.FormPage;




public class Ecommerce_tc_4_test extends base{

	
	@Test
	public void totalValidation() throws IOException, InterruptedException
	{
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     FormPage formPage=new FormPage(driver);
	     formPage.nameField.sendKeys("hello");
	     driver.hideKeyboard();
	     formPage.femaleOption.click();
	     formPage.countrySelection.click();
	     Utilities u=new Utilities(driver);
	     u.scrollToText("Argentina");
	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();
	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	     
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);
		int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sum=0;
		CheckoutPage checkOutPage=new CheckoutPage(driver);
		
		for(int i=0;i<count;i++)
		{
		String amount1=	checkOutPage.productList.get(i).getText();
		double amount=getAmount(amount1);
		sum=sum+amount;
		}
System.out.println(sum+"sum of products");

String total=checkOutPage.totalAmount.getText();

total= total.substring(1);
double totalValue=Double.parseDouble(total);
System.out.println(totalValue+"Total value of products");
AssertJUnit.assertEquals(sum, totalValue);  
service.stop();




	}
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	
	public static double getAmount(String value)
	{
		value= value.substring(1);
		double amount2value=Double.parseDouble(value);
		return amount2value;
		
		
	}
	
	
}
