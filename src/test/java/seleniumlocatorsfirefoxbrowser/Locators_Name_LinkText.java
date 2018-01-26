
package seleniumlocatorsfirefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Name_LinkText {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.linkText("Sign In")).click();
	
		driver.findElement(By.name("identifier")).sendKeys("ftzohratit@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("ghtsdsf");
		
		Thread.sleep(1000);
		driver.findElement(By.id("passwordNext")).click();
		driver.close();


	}

}
