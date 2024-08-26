package com.udemypom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BigBasketProject.BaseClass;
import com.Udemy.UdemyBaseClass;
import com.UdemyReaderFile.UdemyConfigReader;

public class UdemySignUpPom extends UdemyBaseClass{
	
	public WebDriver UdemyPagedriver;
	
	@FindBy(id="form-group--1")
	private WebElement name;
	
	
	@FindBy(name="email")
	private WebElement Email;
	
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SignUp;
	
	public UdemySignUpPom(WebDriver driver){
		
		UdemyPagedriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SignUpPage() throws IOException {
		
		UdemyConfigReader uc = new UdemyConfigReader();
		
		inputPassing(UdemyPagedriver, uc.getName(), name);
		
		inputPassing(UdemyPagedriver, uc.getEmail(), Email);
		
		inputPassing(UdemyPagedriver, uc.getPassword(), Password);
		
		LoginBtn(UdemyPagedriver, SignUp);

		
	}

}
