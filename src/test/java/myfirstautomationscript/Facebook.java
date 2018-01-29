package myfirstautomationscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();




		//driver.get("https://www.facebook.com");
		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
	
       // System.out.println("Successfully opened the facebook website")
		
		//Wait for 6 Sec
		//Thread.sleep(6000);

		// Close the driver
		// driver.close();

	}

}
