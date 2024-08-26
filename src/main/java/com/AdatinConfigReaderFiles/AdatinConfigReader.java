package com.AdatinConfigReaderFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AdatinConfigReader {
	
	Properties pr;
	FileInputStream fs;
	
	private Properties getAdatinData() throws IOException {
		
		pr = new Properties();
		File f = new File("C:\\Users\\gayat\\BigBasketProject\\src\\main\\java\\com\\AdatinConfigProperties\\Adatin.properties");
		fs = new FileInputStream(f);
		pr.load(fs);
		return pr;
	}
	
	public String getBrowsername() throws IOException {
		
		String browsername = getAdatinData().getProperty("browser");
		return browsername;
	}
	
	public String getUrl() throws IOException {
		
		String url = getAdatinData().getProperty("url");
		return url;
	}
	
	public String getusername() throws IOException {
		
		String username = getAdatinData().getProperty("username");
		return username;

	}
	
	public String getpassword() throws IOException {
		String password = getAdatinData().getProperty("password");
		return password;

	}
	
	

}
