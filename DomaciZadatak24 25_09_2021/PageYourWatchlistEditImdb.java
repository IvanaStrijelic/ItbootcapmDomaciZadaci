package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageYourWatchlistEditImdb {
	
	WebDriver driver;
	WebElement addToListField; 
	WebElement titleMovieFirst;
	WebElement titleMovieSecond;
	WebElement buttonDone;
	WebElement addToListResult;
	
	public WebElement getAddToListResult() {
		return driver.findElement(By.xpath("//select*[@id=\"add-to-list-search\"]"));
	}

	public PageYourWatchlistEditImdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAddToListField() {
		return driver.findElement(By.id("add-to-list-search"));
	}

	public WebElement getTitleMovieFirst() {
		return driver.findElement(By.xpath("//*[@id=\"add-to-list-search-results\"]/a[1]/div/span[1]"));
	}

	public WebElement getTitleMovieSecond() {
		return driver.findElement(By.xpath("//*[@id=\"add-to-list-search-results\"]/a[2]"));
	}

	public WebElement getButtonDone() {
		return driver.findElement(By.cssSelector(".btn-raised.btn-raised--primary.list-edit-done"));
	}
	public void pressButtonDone() {
		this.getButtonDone().click();
	}
	public void insertTitle(String titleData) {
		this.getAddToListField().sendKeys(titleData);
	}
	public void showListOfMovies() {
		this.getAddToListField().click();
	}

	public String textAddedTitleToList() {
		return getTitleMovieFirst().getText();
	}
}
