package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciZadatak2 {
	/*Pomocu jave i selenijuma
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite
3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next)
 pustiti drugi predlozen video*/

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("search_query"));
		searchBox.sendKeys("Rick Astley");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		searchButton.click();
		Thread.sleep(2000);
		WebElement songPlay = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
		songPlay.click();
		Thread.sleep(2000);
		
		WebElement skipAds = driver.findElement(By.name("passive_signin"));
		skipAds.click();
		WebElement skipAds2 = driver.findElement(By.id("speedyg"));
		skipAds2.click();
		Thread.sleep(2000);
		WebElement songPlay2 = driver.findElement(By.xpath("//*[@id=\"native-chat-template\"]"));
		songPlay2.click();
		
		
		
	
		
	
	}

}
