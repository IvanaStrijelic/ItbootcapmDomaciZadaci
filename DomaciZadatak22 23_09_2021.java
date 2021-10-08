package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zad9 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Otici na sajt demoqa, kliknuti na Elements, kliknuti na Text Box, popuniti
		 * podatke i kliknuti na Submit. Sa leve strane kliknuti na Checkbox. Cekirati
		 * samo "Desktop" i utvrditi da je samo taj checkbox cekira. Kliknuti na Radio
		 * Button sa leve strane, kliknuti na "Yes" pa na "Impressive" i utvrditi da se
		 * radio button promenio. Dodatak, proveriti da li je uneta adresa u Current
		 * address i Permanent address ista i ispisati u konzoli. Dobro pogledajte
		 * lokatore za ovo ODAKLE ih uzimate i testirajte da li program tu dobro radi.
		 */

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")));
		WebElement buttonElements = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonElements);
		buttonElements.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("text")));
		WebElement buttonTextBox = driver.findElement(By.className("text"));
		buttonTextBox.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
		WebElement fullNameBox = driver.findElement(By.id("userName"));
		fullNameBox.sendKeys("Ivana");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("userEmail")));
		WebElement emailBox = driver.findElement(By.id("userEmail"));
		emailBox.sendKeys("ilic.ivanaa@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("currentAddress")));
		WebElement addressBox = driver.findElement(By.id("currentAddress"));
		addressBox.sendKeys("Beograd");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("permanentAddress")));
		WebElement permanentAddressBox = driver.findElement(By.id("permanentAddress"));
		permanentAddressBox.sendKeys("Beograd");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		WebElement buttonSubmit = driver.findElement(By.cssSelector(".btn.btn-primary"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonSubmit);
		Thread.sleep(500);
		buttonSubmit.click();

		WebElement currentAddressTest = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
		WebElement permanentAddressTest = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		String message1 = currentAddressTest.getText();
		String message2 = permanentAddressTest.getText();

		if (message1.equals(message2)) {
			System.out.println("Trenutna i privremena adresa su iste.");
		} else {
			System.out.println("Trenutna i privremena adresa su razlicite.");
		}

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-1\"]/span")));
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkBox);
		checkBox.click();
	
		WebElement toggle = driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
		toggle.click();
		
		WebElement checkDesktop = driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
		checkDesktop.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".col-12.mt-4.col-md-6")));
		WebElement bodyDesktopTest = driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6"));
		WebElement desktopTest = driver.findElement(By.xpath("//*[@id=\"result\"]/span[2]"));
		String message01 = bodyDesktopTest.getText();
		String message02 = desktopTest.getText();

		if (!message01.equals(message02)) {
			System.out.println("PASS - Desktop je cekiran!");
		} else {
			System.out.println("FALL - Desktop nije cekiran!");
		}

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-2\"]/span")));
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButton);
		radioButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")));
		WebElement yesRadio = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
		yesRadio.click();
		
		WebElement impressiveRadio = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
		impressiveRadio.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span")));
		WebElement impressiveRadioTest = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span"));
		String impressiveMessage = impressiveRadioTest.getText();

		if (impressiveMessage.contains("Impressive")) {
			System.out.println("PASS - Radio Button se promenio!");
		} else {
			System.out.println("FALL - Radio Button se nije promenio!");
		}

		driver.close();
	}

}
