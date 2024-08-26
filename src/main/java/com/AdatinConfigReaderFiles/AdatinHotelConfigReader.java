package com.AdatinConfigReaderFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AdatinHotelConfigReader {
	
	Properties pr;
	FileInputStream fis;
	
	public Properties getHotelData() throws IOException {
		
		File f = new File("C:\\Users\\gayat\\BigBasketProject\\src\\main\\java\\com\\AdatinConfigProperties\\HotelConfig.properties");		
		pr = new Properties();
		fis = new FileInputStream(f);
		pr.load(fis);
		return pr;
	}

	public String getbrowsername() throws IOException {
		
		String browser = getHotelData().getProperty("browser");

		return browser;
	}
	
	public String getUrl() throws IOException {
		
		String Url = getHotelData().getProperty("url");

		return Url;
	}

	public String getlocation() throws IOException {
	
	String location = getHotelData().getProperty("location");

	return location;
	}
	
	public String gethotels() throws IOException {
		
		String Hotels = getHotelData().getProperty("hotels");

		return Hotels;
		}
	
	public String getRoomtype() throws IOException {
	
	String Roomtype = getHotelData().getProperty("room_type");

	return Roomtype;
	
	}
	
	public String getNumberofRooms() throws IOException {
		
		String NumberofRooms = getHotelData().getProperty("room_nos");

		return NumberofRooms;
	}
	
	public String getCheckInDate() throws IOException {
		
		String CheckInDate = getHotelData().getProperty("datepick_in");

		return CheckInDate;
		
	}
	
	public String getCheckOutDate() throws IOException {
		
		String CheckOutDate = getHotelData().getProperty("datepick_out");

		return CheckOutDate;
		
	}

	public String getAdultsperRoom() throws IOException {
	
	String AdultsperRoom = getHotelData().getProperty("adult_room");

	return AdultsperRoom;
	
	}
	
	public String getChildrenPerRoom () throws IOException {
		
		String ChildrenPerRoom  = getHotelData().getProperty("child_room");

		return ChildrenPerRoom ;
		
	}	
	
}
