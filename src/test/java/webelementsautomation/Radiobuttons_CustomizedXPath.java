package webelementsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons_CustomizedXPath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		driver.findElement(By.xpath("//input[@value='QBP']")).click();
		Thread.sleep(2000);
		
		//driver.close();

	}

}
