package com.POM_ManagerFiles;

import com.AdatinConfigReaderFiles.AdatinConfigReader;
import com.AdatinConfigReaderFiles.AdatinHotelConfigReader;
import com.AdatinPOM.AdatinLoginPage;
import com.AdatinPOM.SearchHotelsPage;
import com.BigBasketProject.BaseClass;

public class POM_PageObjectManager extends BaseClass{
	
	private AdatinLoginPage login;
	private AdatinConfigReader reader;
	private SearchHotelsPage search;
	private AdatinHotelConfigReader hotelreader;

	public AdatinLoginPage getAdatinLoginPage() {
		
		if(login == null) {
			
			login = new AdatinLoginPage(driver);
		}
		return login;	
	}
	
	public AdatinConfigReader getAdatinConfigData() {
		
		if(reader == null) {
			
			reader = new AdatinConfigReader();	
		}
		return reader;
	}
	
	public AdatinHotelConfigReader getAdatinHotelData() {
		
		if(hotelreader == null) {
			
			hotelreader = new AdatinHotelConfigReader();
		}
		return hotelreader;	
	}
	
	public SearchHotelsPage getSearchHotelsPage(){
		
		if(search == null) {
			
			search = new SearchHotelsPage(driver);	
		}
		return search;	
	}
}
