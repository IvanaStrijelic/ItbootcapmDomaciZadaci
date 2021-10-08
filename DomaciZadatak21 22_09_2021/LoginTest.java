package DomaciZadatak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	private String websiteUrl = "https://the-internet.herokuapp.com/login";

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void login(String username, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(this.getWebsiteUrl());
		WebElement usernameBox = driver.findElement(By.id("username"));
		usernameBox.clear();
		usernameBox.sendKeys(username);
		Thread.sleep(2000);
		WebElement passwordBox = driver.findElement(By.id("password"));
		passwordBox.clear();
		passwordBox.sendKeys(password);
		Thread.sleep(2000);
		WebElement buttonLogin = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		buttonLogin.click();
		Thread.sleep(2000);

		WebElement buttonLogout = driver.findElement(By.className("icon-2x icon-signout"));

		if (buttonLogout.isDisplayed()) {
			System.out.println("PASS");
		} else {
			System.out.println("FALL");
		}

	}

}
