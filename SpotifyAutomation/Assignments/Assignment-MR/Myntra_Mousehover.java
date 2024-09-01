package assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.myntra.com");
		Actions a=new Actions(d);
		List<WebElement> cat = d.findElements(By.xpath("//a[@class='desktop-main']"));
		for(WebElement Allcat:cat) {
			a.moveToElement(Allcat).perform();Thread.sleep(2000);
		}
		d.quit();
	}
}
