package webelementsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons_Dynamically {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");

		int count =driver.findElements(By.xpath("//input[@name='software']")).size();

		for(int i=0;i<count;i++)

		{

			driver.findElements(By.xpath("//input[@name='software']")).get(2).click();

			String text=driver.findElements(By.xpath("//input[@name='software']")).get(0).getAttribute("value");

			if(text.equals("Excel"));
			{
				driver.findElements(By.xpath("//input[@name='software']")).get(0).click();

			}
		}

	}

}
