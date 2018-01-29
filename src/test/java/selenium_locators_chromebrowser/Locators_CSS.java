package selenium_locators_chromebrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CSS {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ftzohratit@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ftzohratit");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span._9mno0:nth-child(1) > button:nth-child(1)")).click();




	}

}
