package assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AllLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		d.findElement(By.tagName("textarea")).sendKeys("Qspider"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> alllink=d.findElements(By.tagName("a"));
		int count=alllink.size();
		System.out.println(count);
		for(WebElement ele:alllink)
		{
			String attribute=ele.getAttribute("href");
			System.out.println(attribute);
		}
		d.quit();

	}

}
