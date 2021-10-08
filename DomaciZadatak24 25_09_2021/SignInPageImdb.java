package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageImdb {
	
	WebDriver driver;
	WebElement emailField; 
	WebElement passwordField;
	WebElement signInBotton; 
	
	public SignInPageImdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("ap_password"));
	}

	public WebElement getSignInBotton() {
		return driver.findElement(By.id("a-autoid-0"));
	}
	
	public void pressSignInBotton() {
		this.getSignInBotton().click();
	}
	public void insertEmail(String emailData) {
		this.getEmailField().sendKeys(emailData);
	}
	
	public void insertPassword(String passwordData) {
		this.getPasswordField().sendKeys(passwordData);
	}

}
