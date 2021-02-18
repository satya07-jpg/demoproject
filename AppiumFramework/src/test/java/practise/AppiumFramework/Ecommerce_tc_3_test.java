package practise.AppiumFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;



public class Ecommerce_tc_3_test extends base{
  
	
	@DataProvider
	public Object[][] getLoginData() {
		Object data[][] = TestUtil.getTestData("login");
		return data;
	}

	@Test(dataProvider="getLoginData")
	public void Validation(String username) throws IOException, InterruptedException
	{
		
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys(username);

     driver.hideKeyboard();

     driver.findElement(By.xpath("//*[@text='Male']")).click();

     driver.findElement(By.id("android:id/text1")).click();

     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");

     driver.findElement(By.xpath("//*[@text='India']")).click();

     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

     service.stop();

}
}

     
