package webelementsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/Flights");
		Select S= new Select(driver.findElement(By.id("flight-adults-flp")));
		S.selectByValue("3");
		S.selectByIndex(4);
		S.selectByVisibleText("6");
	}

}
