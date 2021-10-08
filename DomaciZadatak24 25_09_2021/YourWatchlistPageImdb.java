package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourWatchlistPageImdb {

	WebDriver driver;
	WebElement editButton;
	WebElement firstTitleFromList;

	public YourWatchlistPageImdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEditButton() {
		return driver.findElement(By.className("button-title"));
	}

	public WebElement getFirstTitleFromList() {
		return driver.findElement(By.xpath("//*[@id=\"page-1\"]/div/div/div[2]/h3/a"));
	}

	public void pressEditButton() {
		this.getEditButton().click();
	}

	public String getTextFirstTitleFromList() {
		return getFirstTitleFromList().getText();
	}
}
