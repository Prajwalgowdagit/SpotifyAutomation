package assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AutoSugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14 pro max");
		Thread.sleep(3000);
		List<WebElement> autosugg=d.findElements(By.xpath("//span[contains(text(),'iphone 14 pro max')]"));
		int count=autosugg.size();
		System.out.println(count);
		for(WebElement ele:autosugg)
		{
			String txt=ele.getText();
			System.out.println(txt);
		}
		d.quit();
	}

}
