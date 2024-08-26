package com.AdatinPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdatinInterface.SearchPageElements;
import com.BigBasketProject.BaseClass;
import com.POM_ManagerFiles.POM_PageObjectManager;

public class SearchHotelsPage extends BaseClass implements SearchPageElements  {
	
	public static WebDriver hotelsdriver;
	
	@FindBy(id= Location_id)
	private WebElement Location;
	
	@FindBy(id= Hotels_id)
	private WebElement hotels;
	
	@FindBy(id = Roomtype_id)
	private WebElement roomtype;
	
	@FindBy(id = roomnos_id )
	private WebElement roomnos;
	
	@FindBy(id = Datepickin_id)
	private WebElement pickindate;
	
	@FindBy(id = datepickout_id )
	private WebElement pickoutdate;
	
	@FindBy(id = adultroom_id)
	private WebElement adultroom;
	
	@FindBy(id = childroom_id)
	private WebElement childroom;
	
	@FindBy(id = Submit_id)
	private WebElement submit;

	public SearchHotelsPage(WebDriver driver) {
		
		hotelsdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
public void getHotelsPage() throws IOException {
		
		POM_PageObjectManager pom = new POM_PageObjectManager();
		
		DropDownOptions(hotelsdriver,Location, pom.getAdatinHotelData().getlocation());
		DropDownOptions(hotelsdriver, hotels, pom.getAdatinHotelData().gethotels());
		DropDownOptions(hotelsdriver,roomtype, pom.getAdatinHotelData().getRoomtype());
		DropDownOptions(hotelsdriver, roomnos, pom.getAdatinHotelData().getNumberofRooms());
		inputPassing(hotelsdriver,pickindate, pom.getAdatinHotelData().getCheckInDate());
		inputPassing(hotelsdriver, pickoutdate, pom.getAdatinHotelData().getCheckOutDate());
		DropDownOptions(hotelsdriver,adultroom, pom.getAdatinHotelData().getAdultsperRoom());
		DropDownOptions(hotelsdriver, childroom, pom.getAdatinHotelData().getChildrenPerRoom());
		ClickElement(hotelsdriver, submit);
	}

}
