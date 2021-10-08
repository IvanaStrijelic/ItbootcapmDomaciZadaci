package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageImdb {
	
	WebDriver driver;
	WebElement signInWithImbdButton;
	
	public RegistrationPageImdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInWithImbdButton() {
		return driver.findElement(By.cssSelector(".auth-sprite.imdb-logo.retina"));
	}

	public void pressSignInWithImbdButton() {
		this.getSignInWithImbdButton().click();
	}
	
}
