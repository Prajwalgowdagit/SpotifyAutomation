package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_Vtiger {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.get("https://www.vtiger.com");
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.linkText("Company"))).perform();
		d.findElement(By.linkText("About Us")).click();//Thread.sleep(3000);
		a.doubleClick(d.findElement(By.id("loginspan"))).perform();
		String res=d.getTitle();
		if(res.contains("Login")) {
			System.out.println("Login page is displayed");
		}else {
			System.out.println("Login page is not displayed");
		}
		d.quit();
	}
}
