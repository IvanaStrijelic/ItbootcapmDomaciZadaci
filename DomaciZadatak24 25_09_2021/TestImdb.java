package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseImdb;


public class TestImdb extends BaseImdb {
	
	@BeforeMethod
	public void pageSetUp () {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com/");
	}
	@Test (priority = 10)
	public void correctFilmAddedToList () throws InterruptedException {
		homePageImdb.pressWatchlistButton();
		registrationPageImdb.pressSignInWithImbdButton();
		signInPageImdb.insertEmail("ilic.ivanaa@gmail.com");
		signInPageImdb.insertPassword("Ivana*Teofil");
		signInPageImdb.pressSignInBotton();
		yourWatchListPageImdb.pressEditButton();
		pageYourWatchListEditImdb.insertTitle("Joker");
		
		Select movie = new Select (driver.findElement(By.xpath("//*[@id=\"add-to-list-search-results\"]")));
		Thread.sleep(3000);
		movie.selectByVisibleText("Joker (2019)");
		
		pageYourWatchListEditImdb.pressButtonDone();
		
		Assert.assertEquals(pageYourWatchListEditImdb.textAddedTitleToList(), "Joker");
	
}
}
