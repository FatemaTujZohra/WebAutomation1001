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
		//String[] text =new String[4];
		String text;
		for(int i=0;i<count;i++)

			{
			driver.findElements(By.xpath("//input[@name='software']")).get(0).click();
			//driver.findElements(By.xpath("//input[@name='software']")).get(3).click();

			
			text=driver.findElements(By.xpath("//input[@name='software']")).get(i).getAttribute("value");
                // System.out.println(text[i]);
			//if(text == "Excel")
			
					{
						//int j=i;
							driver.findElements(By.xpath("//input[@name='software']")).get(0).click();

					}
				}

	}

}
