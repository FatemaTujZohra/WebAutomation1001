package childwindow_Iframes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_ChildWindowCiTi {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[title='LOGIN NOW']")).click();

		System.out.println(driver.getTitle());
		//"Citi India - Credit Card | Loan | Investment | Insurance | Banking"  (Parent window title)
		
		
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it= ids.iterator();
		String ParentID= it.next();
		String ChildID= it.next();
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());// "Citibank India" (child window title)

	}

}


//<img src="/images/login.png" width="171" height="26" alt="LOGIN NOW" title="LOGIN NOW">

// this is outer HTML for LOGIN NOW

