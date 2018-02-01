package childwindow_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_frames_byname {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[title='class in org.openqa.selenium.interactions']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.partialLinkText("org.openqa.selenium")).click();




	}

}

//   <frame src="allclasses-frame.html" name="packageFrame" title="All classes and interfaces (except non-static nested types)">
//  /html/body/div/ul/li[9]/a
//  <a href="org/openqa/selenium/interactions/Actions.html" title="class in org.openqa.selenium.interactions" target="classFrame">Actions</a>

//  <frame src="overview-frame.html" name="packageListFrame" title="All Packages">



