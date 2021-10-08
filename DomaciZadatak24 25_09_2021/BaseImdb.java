package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageTest.HomePageImdb;
import PageTest.PageYourWatchlistEditImdb;
import PageTest.RegistrationPageImdb;
import PageTest.SignInPageImdb;
import PageTest.YourWatchlistPageImdb;

public class BaseImdb {
	
	public WebDriver driver;
	
	public HomePageImdb homePageImdb;
	public PageYourWatchlistEditImdb pageYourWatchListEditImdb;
	public RegistrationPageImdb registrationPageImdb;
	public SignInPageImdb signInPageImdb;
	public YourWatchlistPageImdb yourWatchListPageImdb;
	
	@BeforeClass
	public void setUp() {
	    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	    driver = new ChromeDriver();
	    homePageImdb = new HomePageImdb(driver);
	    pageYourWatchListEditImdb = new PageYourWatchlistEditImdb(driver);
	    registrationPageImdb = new RegistrationPageImdb(driver);
	    signInPageImdb = new SignInPageImdb(driver);
	    yourWatchListPageImdb = new YourWatchlistPageImdb(driver);
	   
	   // wait = new WebDriverWait(driver, 20);
	}

	@AfterClass
	public void tearDown() {
	  // driver.close();
	  // driver.quit();
	}
	
	
	
}
