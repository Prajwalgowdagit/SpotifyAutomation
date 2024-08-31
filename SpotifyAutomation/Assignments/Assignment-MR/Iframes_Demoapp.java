package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Demoapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");Thread.sleep(5000);
		d.switchTo().frame(0);
		d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		d.switchTo().defaultContent();
		d.switchTo().frame(1);
		d.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		d.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
	}
}
