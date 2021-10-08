package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageImdb {
	
	WebDriver driver;
	WebElement watchlistButton;
	
	public HomePageImdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getWatchlistButton() {
		return driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[4]/a/div"));
	}
	
	public void pressWatchlistButton() {
		this.getWatchlistButton().click();
	}

}
