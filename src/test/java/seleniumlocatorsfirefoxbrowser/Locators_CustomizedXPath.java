package seleniumlocatorsfirefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_CustomizedXPath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@data-pid= '23']")).click();
		driver.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ftzohratit@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ghtsdsf");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.close();

	}

}
