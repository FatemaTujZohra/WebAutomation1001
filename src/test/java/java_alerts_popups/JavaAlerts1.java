package java_alerts_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlerts1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#signin_info > a:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();


	}

}
