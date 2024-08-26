package com.udemypom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Udemy.UdemyBaseClass;
import com.UdemyReaderFile.UdemyConfigReader;

public class UdemyLoginPom extends UdemyBaseClass{
	
	public WebDriver UdemyLogindriver;
	
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement Login;
	
	
	@FindBy(name="email")
	private WebElement Email;
	
	
	@FindBy(name="password\"")
	private WebElement password;
	
	@FindBy(xpath="//a[@aria-label='Log in']")
	private WebElement Loginbtn;
	
	
	
	
	public UdemyLoginPom(WebDriver driver){
		
		UdemyLogindriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
public void LoginPage() throws IOException {
		
		UdemyConfigReader uc = new UdemyConfigReader();
		
		inputPassing(UdemyLogindriver, uc.getName(), Login);
		
		inputPassing(UdemyLogindriver, uc.getEmail(), Email);
		
		inputPassing(UdemyLogindriver, uc.getPassword(), password);
		
		LoginBtn(UdemyLogindriver, Loginbtn);

		
	}
	

}
