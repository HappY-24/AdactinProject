package com.Udemy;

import java.io.IOException;

import com.UdemyReaderFile.UdemyConfigReader;
import com.udemypom.UdemyLoginPom;
import com.udemypom.UdemyOrganizationPom;
import com.udemypom.UdemySignUpPom;

public class UdemyRunnerClass extends UdemyBaseClass {
	
	public static void main(String[] args) throws IOException {
		

	
	UdemyConfigReader uc = new UdemyConfigReader();
	
	browserLaunch(uc.getBrowser());
	launchingUrl(uc.getUrl());
	
	UdemySignUpPom us = new UdemySignUpPom(driver);
	
	us.SignUpPage();

	UdemyLoginPom ul = new UdemyLoginPom(driver);
	
	ul.LoginPage();
	
	UdemyOrganizationPom uo = new UdemyOrganizationPom(driver);
	
	uo.UdemyOrganizationPage();
	
	
}
	
	
	
	
	


}
