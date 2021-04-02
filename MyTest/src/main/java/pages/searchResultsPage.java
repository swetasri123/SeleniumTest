package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchResultsPage {
	WebDriver driver;
	By duckDuckGoLink = By.partialLinkText("DuckDuckGo — Privacy, simplified.");
	
	public searchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickDuckDcuckGoLink() {
		driver.findElement(duckDuckGoLink).click();
	}
}
