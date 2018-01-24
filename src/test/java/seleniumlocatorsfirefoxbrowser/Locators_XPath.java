//Though XPath staring with html is not reliable, I am using it for practice purpose.

package seleniumlocatorsfirefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_XPath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[2]/div/div/div[1]/div[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ftzohratit@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")).click();
		Thread.sleep(3000);
		
	    driver.close();

	}

}

