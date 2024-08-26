package com.AdatinPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdatinInterface.LoginElements;
import com.BigBasketProject.BaseClass;
import com.POM_ManagerFiles.POM_PageObjectManager;

public class AdatinLoginPage extends BaseClass implements LoginElements{
	
	public static WebDriver adatindriver;
	
	@FindBy(id=UserName_id)
	private WebElement username;
	
	@FindBy(name=password_name)
	private WebElement password;
	
	@FindBy(name = Login_name)
	private WebElement LoginBtn;
	
	public AdatinLoginPage(WebDriver driver) {
		
		adatindriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getLoginPageElements() throws IOException {
		
		POM_PageObjectManager pom = new POM_PageObjectManager();
		
		inputPassing(adatindriver,username, pom.getAdatinConfigData().getusername());
		inputPassing(adatindriver, password, pom.getAdatinConfigData().getpassword());
		ClickElement(adatindriver, LoginBtn);
		
		

	}

}
