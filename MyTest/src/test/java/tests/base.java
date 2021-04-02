package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	
	public WebDriver initializeDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhishek sinha\\Downloads\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	     return driver;
	}
	
}