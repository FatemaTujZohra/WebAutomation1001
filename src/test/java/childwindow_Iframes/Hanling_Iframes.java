package childwindow_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hanling_Iframes {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/p/a")).click();
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("a.active:nth-child(4)")).click();
		//driver.findElement(By.cssSelector("div.w3-example:nth-child(10) > a:nth-child(3)")).click();
		
	
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='iframeResult']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'iframe\']")));
		
		driver.findElement(By.xpath("/html/body/button")).click();

	}

}
//*[@id="iframe"]
//*[@id="iframe"]
