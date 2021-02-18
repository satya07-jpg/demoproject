package pageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login {
	
	public Login(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//*[@text='I ACCEPT THE TERMS']")
	public WebElement accept;
	
	@AndroidFindBy(xpath="//*[@text='ANONYMOUS LOGIN']")
	public WebElement anylgn;
	
	@AndroidFindBy(xpath="//*[@text='India']")
	public WebElement country;
	
	@AndroidFindBy(xpath="//*[@text='SELECT']")
	public WebElement selbtn;
	
	@AndroidFindBy(xpath="//*[@text='OK']")
	public WebElement okbtn;
	
	
	
	
	
	
	

}
