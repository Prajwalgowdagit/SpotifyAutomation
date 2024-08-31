package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Calender {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("https://www.facebook.com");
		d.findElement(By.linkText("Create new account")).click();
		WebElement day=d.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByIndex(11);
		WebElement month=d.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("1");
		WebElement year=d.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("2002");
		d.quit();
	}

}
