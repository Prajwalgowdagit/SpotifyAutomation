package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hdfc_Bank {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://www.hdfcbank.com");
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//button[contains(text(),'Login')]"))).perform();
		d.findElement(By.linkText("NetBanking")).click();
		Set<String> tabs = d.getWindowHandles();
		for (String t : tabs) {
			d.switchTo().window(t);
		}Thread.sleep(3000);
		d.switchTo().frame(0);
		d.findElement(By.linkText("Know More...")).click();
		Set<String> tabs1 = d.getWindowHandles();
		for (String t : tabs1) {
			d.switchTo().window(t);
		}
		List<WebElement> lang = d.findElements(By.xpath("//p[contains(text(),'Download')]/a"));
		for (WebElement ele : lang ) { 
			System.out.println(ele.getText()); 
			}
	}

}
