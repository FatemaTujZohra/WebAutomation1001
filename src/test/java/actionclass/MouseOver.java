package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HELLO");

		Thread.sleep(2000);

		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

		//If we want to perform mouse over from one location to another location on an Webpage we 
		//need to create driver instance with 'Actions' class and use moveToElement method



	}

}
