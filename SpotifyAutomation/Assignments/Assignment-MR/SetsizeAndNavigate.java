package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetsizeAndNavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Dimension d1=new Dimension(555,333);
		d.manage().window().setSize(d1);
		d.get("https://www.facebook.com");
		d.navigate().to("https://www.instagram.com");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.manage().deleteAllCookies();
		d.manage().window().minimize();Thread.sleep(2000);
		d.quit();
	}

}
