package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pib_DisableNotification {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications","--start-maximized");
		WebDriver d=new ChromeDriver(opt);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://pib.gov.in/indexd.aspx");Thread.sleep(5000);
		d.findElement(By.partialLinkText("Ministry of Defence")).click();
		d.switchTo().alert().accept();
		Set<String> tab = d.getWindowHandles();
		for (String t : tab) {
			d.switchTo().window(t);
		}
		System.out.println(d.getTitle());
	}
}
