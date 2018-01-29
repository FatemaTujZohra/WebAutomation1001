package webelementsautomation;

import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns_Birthday {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();




		//driver.get("https://www.facebook.com");
		driver.get("https://www.facebook.com");

		
		//driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Mar");
		//In this way I was not able to select March as a Month.I wanted to select a birthday of Mar 29 1993
		
		Select m= new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		m.selectByValue("3");
		Select d= new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		d.selectByVisibleText("20");
		Select y= new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		y.selectByValue("1994");
	}

}
