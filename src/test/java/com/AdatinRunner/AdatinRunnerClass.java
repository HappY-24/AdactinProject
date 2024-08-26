package com.AdatinRunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AdatinPOM.SearchHotelsPage;
import com.BigBasketProject.BaseClass;
import com.POM_ManagerFiles.POM_PageObjectManager;

public class AdatinRunnerClass extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		POM_PageObjectManager pm = new POM_PageObjectManager();
		
        browserLaunch(pm.getAdatinConfigData().getBrowsername());
        
		launchingUrl(pm.getAdatinConfigData().getUrl());
		
		pm.getAdatinLoginPage().getLoginPageElements();

		pm.getSearchHotelsPage().getHotelsPage();
		
		
	}

}
