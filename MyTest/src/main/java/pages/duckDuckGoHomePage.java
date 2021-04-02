package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class duckDuckGoHomePage {
	WebDriver driver;
	By duckDuckImage = By.id("pg-index");
	
	public  duckDuckGoHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyDuckDuckGoImage() {
		boolean chekcIfduckDuckImageExists = driver.findElement(duckDuckImage).isDisplayed();
		assertTrue(chekcIfduckDuckImageExists);
	}
}