package com.BigBasketProject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Pom.DemoPom;
import com.ReaderFile.ConfigReader;

public class RunnerClass extends BaseClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		
		
		ConfigReader cr = new ConfigReader();
		
		browserLaunch(cr.getBrowser());
		launchingUrl(cr.getUrl());
		DemoPom d =  new DemoPom(driver);
		d.Clearingvalues();
		
		d.LoginPageElements();
		
//		browserLaunch("chrome");
//		DemoPom d = new DemoPom(driver);
//		//getUrl("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//		d.Clearingvalues();
//		d.LoginPageElements();
		
		
//		browserLaunch("chrome");
//		getUrl("https://www.amazon.in/");
//		getTitle();
//		navigate("https://demo.automationtesting.in/Frames.html");
////		WebElement Frames = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
//		FrameOptions();
//		navigate("https://www.amazon.in/");
//		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//		SearchBox(element);
//		ScrollOptions();
//		WebElement Search = driver.findElement(By.id("nav-search-submit-button"));
//		SearchIcon(Search);
//		ScreenShot();
//		CurrentLink();
//		WebElement DropDownBtn = driver.findElement(By.id("searchDropdownBox"));
//		DropDownOptions(DropDownBtn);
//		
//		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		Webelementmethods(searchBox); 
//		WebElement mouseOperations = driver.findElement(By.id("twotabsearchtextbox"));
//		mouseActions(driver, mouseOperations);
//		
//		navigate("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
//		
//		WebElement SimpleAlert = driver.findElement(By.id("alertexamples"));
//		AlertOptions(SimpleAlert);
//		//WebElement Keyboard = driver.findElement(By.id("twotabsearchtextbox"));
		
		
		
		
	}

}
