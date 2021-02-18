package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class watchlist {
	public watchlist(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//*[@text='Find Stocks']")
	public WebElement findst;
	
	@AndroidFindBy(xpath="//*[@text='Search']")
	public WebElement search;
	
	@AndroidFindBy(className="android.widget.ImageView")
	public WebElement imgview;
	
	
	@AndroidFindBy(xpath="//*[@text='Reliance Industries Limited']")
	public WebElement rel;
	
	@AndroidFindBy(xpath="//*[@text='HDFC Bank Limited']")
	public WebElement hdfc;
	
	@AndroidFindBy(xpath="//*[@text='Maruti Suzuki India Limited']")
	public WebElement maruti;
	
	@AndroidFindBy(xpath="//*[@text='Polycab India Limited']")
	public WebElement polycab;
	
	
	
	
	
	
	
	
}