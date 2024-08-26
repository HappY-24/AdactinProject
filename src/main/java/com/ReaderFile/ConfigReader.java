package com.ReaderFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class ConfigReader {
	
	static Properties pr;
	static FileInputStream fs;
	
	
	private Properties getData() throws IOException {
		
		File file = new File("C:\\Users\\gayat\\BigBasketProject\\src\\main\\java\\com\\ConfigProperties\\Config.Properties");
		
		pr = new Properties();
		fs = new FileInputStream(file);
		
		pr.load(fs);
		
		return pr;
	}
	
	public String getBrowser() throws IOException {
		
		String browser = getData().getProperty("browser");
		return browser;
		
	}
	
	public String getUrl() throws IOException {
		
		String url = getData().getProperty("url");
		return url;
	}
	
	public String getEmail() throws IOException {
		
		String Email = getData().getProperty("email");
		return Email;
		
	}
	
	public String getpassword() throws IOException {
		
		String password = getData().getProperty("password");
		return password;
		
	}
	
}
