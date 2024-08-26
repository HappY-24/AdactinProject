package com.udemypom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Udemy.UdemyBaseClass;
import com.UdemyReaderFile.UdemyConfigReader;

public class UdemyOrganizationPom extends UdemyBaseClass{
	
public WebDriver UdemyOragnizationdriver;
	
	@FindBy(xpath="//a[@aria-label='Log in with your organization']")
	private WebElement OragnizationBtn;
	
	
	@FindBy(id="form-group--1")
	private WebElement Emails;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ContinueBtn;
	
	
	
	
	public UdemyOrganizationPom(WebDriver driver){
		
		UdemyOragnizationdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void UdemyOrganizationPage() throws IOException {
		
		UdemyConfigReader uc = new UdemyConfigReader();
		
		inputPassing(UdemyOragnizationdriver, uc.getName(), OragnizationBtn);
		
		inputPassing(UdemyOragnizationdriver, uc.getEmail(), Emails);
		
		inputPassing(UdemyOragnizationdriver, uc.getPassword(), ContinueBtn);
		
		LoginBtn(UdemyOragnizationdriver, ContinueBtn);

		
	}


}
