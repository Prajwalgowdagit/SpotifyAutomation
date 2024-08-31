package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		WebElement d1=d.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement d2=d.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions a=new Actions(d);
		a.dragAndDrop(d.findElement(By.xpath("//div[text()='Mobile Charger']")), d1).perform();
		a.dragAndDrop(d.findElement(By.xpath("//div[text()='Mobile Cover']")), d1).perform();
		a.dragAndDrop(d.findElement(By.xpath("//div[text()='Laptop Charger']")), d2).perform();
		a.dragAndDrop(d.findElement(By.xpath("//div[text()='Laptop Cover']")), d2).perform();
	}
}
