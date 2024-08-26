package com.Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BigBasketProject.BaseClass;
import com.ReaderFile.ConfigReader;

public class DemoPom extends BaseClass{
	
	public WebDriver DemoPageDriver;
	
	@FindBy(id= "Email")
	private WebElement email;
	
	@FindBy(name="Password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	
	public DemoPom(WebDriver driver) {
		
		DemoPageDriver = driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	public void Clearingvalues() {
		
		ClearValues(DemoPageDriver, email);
		ClearValues(DemoPageDriver, password);
	
	}
	
	public void LoginPageElements() throws IOException, InterruptedException {
		
		
		ConfigReader cs = new ConfigReader();
		//inputPassing(DemoPageDriver, login);
		
		inputPassing(DemoPageDriver,email, cs.getEmail());
		inputPassing(DemoPageDriver,  password, cs.getpassword());
		
		ClickElement(DemoPageDriver,login);

	}
//	public void ClickLogin() throws IOException {
//		
//		
//		ClickElement(DemoPageDriver,submit);
//
//	}
	
}
