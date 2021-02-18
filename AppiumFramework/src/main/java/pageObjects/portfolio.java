package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class portfolio {
	public portfolio(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//*[@text='Number of Stocks']")
	public WebElement nos;
	
	@AndroidFindBy(xpath="//*[@text='BUY']")
	public WebElement buybtn;
	
	@AndroidFindBy(className="android.widget.ImageView")
	public WebElement imgview;
	
	
	@AndroidFindBy(xpath="//*[@text='RELIANCE']")
	public WebElement rels;
	
	@AndroidFindBy(xpath="//*[@text='HDFCBANK']")
	public WebElement hdfcs;
	
	@AndroidFindBy(xpath="//*[@text='My Account']")
	public WebElement Myaccount;
	
	@AndroidFindBy(xpath="//*[@text='RELIANCE - Reliance Industries Limited']")
	public WebElement sellrel;
	
	@AndroidFindBy(xpath="//*[@text='HDFCBANK - HDFC Bank Limited']")
	public WebElement sellhdfc;
	
	
	
	
	
	
	
	
}