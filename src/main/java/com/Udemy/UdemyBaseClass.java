package com.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class UdemyBaseClass {
	
	public static WebDriver driver;
	
	protected static WebDriver browserLaunch(String name) {
		
		if(name.equalsIgnoreCase("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);	
		}
		return driver;
		
	}
	
	protected static void inputPassing(WebDriver driver, String value, WebElement element) {
		
		element.sendKeys(value);
	
	}
	
	protected static void LoginBtn(WebDriver driver, WebElement element) {
		
		element.click();
	
	}
	
		protected static void launchingUrl(String Url) {
		
		driver.get(Url);
	}
	
	

}
