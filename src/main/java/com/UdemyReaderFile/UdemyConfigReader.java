package com.UdemyReaderFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UdemyConfigReader {
	
	static Properties pr;
	static FileInputStream fs;
	
	private Properties getData() throws IOException {
		
		File f = new File("C:\\Users\\gayat\\BigBasketProject\\src\\main\\java\\com\\UdemyConfigProperties\\UdemyConfig.Properties");
		fs = new FileInputStream(f); 
		
		pr = new Properties();
		pr.load(fs);
		return pr;

	}
	public String getBrowser() throws IOException {
		
		String browser = getData().getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() throws IOException {
		
		String Url = getData().getProperty("url");
		return Url;
		
	}
	
	public String getName() throws IOException {
		
		String Name = getData().getProperty("name");
		return Name;
	}
	
	public String getEmail() throws IOException {
		
		String Email = getData().getProperty("email");
		return Email;
		
		
	}
	
	public String getPassword() throws IOException {
		
		String Password = getData().getProperty("password");
		return Password;
		
		
	}
	
	

}
