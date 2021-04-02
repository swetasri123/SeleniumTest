package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class googleHomePage{
WebDriver driver;
By searchTextBox = By.name("q");
public  googleHomePage(WebDriver driver) {
	this.driver = driver;
}
	
//Set user name in textbox

  public void setSearchText(String text){

        driver.findElement(searchTextBox).sendKeys(text);

    }

  public void setSearchTextandEnter(String text){

      driver.findElement(searchTextBox).sendKeys(text);
      driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
  }
}
