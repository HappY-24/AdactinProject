package com.BigBasketProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
	public static WebDriver driver; 
	
	protected static WebDriver browserLaunch(String name) {
		
		if(name.equalsIgnoreCase("chrome")) {

			 ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
		}
		return driver;	
	}
//	
	protected static void ClearValues(WebDriver driver, WebElement element) {
		
		element.clear();
}
	
	protected static void inputPassing(WebDriver driver, WebElement element, String value) {
	
		element.sendKeys(value);	
	}
	protected static void ClickElement(WebDriver driver, WebElement element) {

		element.click();
	}
	
	protected static void launchingUrl(String Url) {
		
		driver.get(Url);
	}
	
	protected static void DropDownOptions(WebDriver driver, WebElement element, String name) { 
		
		Select s = new Select(element);
		
		s.selectByValue(name);
		

	}
	
	protected static void getTitle(WebDriver driver) { 
		
		System.out.println(driver.getTitle());
	}
	
	
	protected static void navigate(String ToUrl) {
		
		driver.navigate().to(ToUrl);
		//driver.navigate().back();
		//driver.navigate().forward();

	}
	protected static void CurrentLink() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	protected static void ScreenShot() {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String path = "C:\\Users\\gayat\\BigBasketProject\\Screenshot\\Amazon.png";
		
		File dest = new File(path);
		
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	protected static void SearchBox(WebElement e) {
		e.sendKeys("Mobiles");
	}	

	protected static void SearchIcon(WebElement s) {
		s.click();
	}
	
	protected static void DropDown(WebElement DropDownOptions) {
		
		Select s = new Select(DropDownOptions);
		
		s.selectByValue("Sydney");
//		List<WebElement> AllOptions = s.getOptions();
//		
//		for (WebElement Options : AllOptions) {
//			System.out.println(Options.getText());	
//		}
			
	}
	
	protected static void FrameOptions() {
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement MultiFrameParent = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(MultiFrameParent);
		
		driver.switchTo().frame(0);
		
		WebElement ChildTextBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		ChildTextBox.sendKeys("Hello");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
		WebElement SingleFrameBtn = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(SingleFrameBtn);
		
		WebElement Iframebtn = driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]"));
		
		String text = Iframebtn.getText();
		
	}
	protected static void Webelementmethods(WebElement Search) {
		
		

        boolean isEnabled = Search.isEnabled();
        System.out.println("Search box is enabled: " + isEnabled);

        boolean isDisplayed = Search.isDisplayed();
        System.out.println("Search box is displayed: " + isDisplayed);

//        boolean isSelected = check.isSelected();
//        System.out.println("Checkbox is selected: " + isSelected);
	}
	
	protected static void mouseActions(WebDriver driver, WebElement mouseOp)  {

    Actions actions = new Actions(driver);
    actions.doubleClick(mouseOp).perform();

    
    mouseOp.sendKeys("Oppo");
    
    Robot r;
	try {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}
	protected static void AlertOptions(WebElement Alert) {
		
		Alert.click();
		
		driver.switchTo().alert().accept();
		
		WebElement ConfirmBox = driver.findElement(By.id("confirmexample"));
		
		ConfirmBox.click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement PromptBox = driver.findElement(By.id("promptexample"));
		
		PromptBox.click();
		
		driver.switchTo().alert().sendKeys("Hi");
		
		driver.switchTo().alert().accept();
	}
	protected static void ScrollOptions() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 500)"); 
    js.executeScript("window.scrollBy(0, -500)");
	}
	
	protected static void quit() {
		
		driver.quit();
	}
	
//	protected static void fullScreenshot(){
//		
//		Screenshot take = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//
//		try {
//			ImageIO.write(take.getImage(), "PNG", new File(System.getProperty("user.dir") + "\\Screenshot\\Amazonfull.png"));
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
	
	
}
