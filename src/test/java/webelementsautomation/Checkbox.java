package webelementsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com/Flights");
		driver.findElement(By.cssSelector("input[name='addHotel'")).click();
		boolean T;
		T=driver.findElement(By.cssSelector("input[name='addHotel'")).isSelected();
		System.out.println(T);

	}

}
;