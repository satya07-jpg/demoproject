package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StockButtons {
	public StockButtons(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className="android.widget.ImageButton")
	public WebElement imagebtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='WATCH']")
	public WebElement watchbtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='SELL']")
	public WebElement sellbtn;
	
}