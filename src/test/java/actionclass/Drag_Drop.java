package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.cssSelector("#draggable")).click();
		Actions a= new Actions(driver);
		WebElement source= driver.findElement(By.cssSelector("#draggable"));
		WebElement target= driver.findElement(By.cssSelector("#droppable"));
		
		
		a.dragAndDrop(source, target).build().perform();
		

	}

}
  //    /html/body/div[1]/div[2]/div/div[2]/aside[1]/ul/li[2]/a
//  aside.widget:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)
// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
//    #draggable
//   #droppable