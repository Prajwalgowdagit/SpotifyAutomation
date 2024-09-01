package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_DemoAutomation {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://demo.automationtesting.in/Frames.html");
		d.findElement(By.linkText("Iframe with in an Iframe")).click();
		//d.switchTo().frame(13);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"))); 
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@src='SingleFrame.html']"))); 
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	}
}
