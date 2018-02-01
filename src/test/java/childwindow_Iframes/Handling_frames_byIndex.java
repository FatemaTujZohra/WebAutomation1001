package childwindow_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_frames_byIndex {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(1); // switch to frame 2
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[title='class in org.openqa.selenium.interactions']")).click();
		driver.switchTo().defaultContent();// switch to top window back
		Thread.sleep(3000);
		driver.switchTo().frame(0); //switch to frame 1
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("org.openqa.selenium")).click();

	}



}


