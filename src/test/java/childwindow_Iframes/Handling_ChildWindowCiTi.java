package childwindow_Iframes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_ChildWindowCiTi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.cssSelector("img[title='LOGIN NOW']")).click();
		
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it= ids.iterator();
		String ParentID= it.next();
		String ChildID= it.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());

	}

}


//<img src="/images/login.png" width="171" height="26" alt="LOGIN NOW" title="LOGIN NOW">

//<span class="PrequalBannerButton_DD cA-DD-offerBtn cA-DD-applyNowBtn cA-DD-ADA-Btn" target="_blank" role="button">Get Started</span>

//<a class="cA-DD-offerTextLink cA-DD-detailLink cA-DD-cardLearnMore cA-DD-ADA-Btn" 
//role="button" href="/credit-cards/credit-card-details/citi.action?ID=citi-thankyou-premier-credit-card&amp;afc=165&amp;intc=7~1~64~1~HPBDO~1~citi-thankyou-premier-credit-card~4MMZ5XG81101L10301W">
//Learn More</a>