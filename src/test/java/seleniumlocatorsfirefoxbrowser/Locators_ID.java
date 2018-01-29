package seleniumlocatorsfirefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");



		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("pautit@yahoo.com");
		Thread.sleep(1000);

		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("ghtsdsf");
		Thread.sleep(1000);

		driver.close();
	}

}
