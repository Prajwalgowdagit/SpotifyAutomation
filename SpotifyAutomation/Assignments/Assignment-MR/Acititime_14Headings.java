package assignments;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acititime_14Headings {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("https://online.actitime.com/fireflink4/login.do");
		d.findElement(By.id("username")).sendKeys("mrbharath050@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("actiTIME"+Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.urlToBe("https://online.actitime.com/fireflink4/timetrack/enter.do"));
		d.findElement(By.xpath("//div[@class='menu_icon']/../../../../../div[4]")).click();
		d.findElement(By.linkText("About your actiTIME")).click();
		d.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> tabs = d.getWindowHandles();
		for (String t : tabs) {
			d.switchTo().window(t);
		}
//		List<WebElement> headings = d.findElements(By.xpath("//h2"));
//		List<String> headingTexts = new ArrayList<>();
//		 int i = 0;
//	        while (i < headings.size()) {
//	            headingTexts.add(headings.get(i).getText());
//	            i++;
//	        }
//
//	        Collections.sort(headingTexts, Collections.reverseOrder());
//	        i = 1;
//	        while (i < headingTexts.size()) {
//	            System.out.println(headingTexts.get(i));
//	            i++;
//	        }
		List<WebElement> elements = d.findElements(By.tagName("h2")); 
		ListIterator<WebElement> list=elements.listIterator(elements.size()); 
		while (list.hasPrevious()){ 
		WebElement next1 = list.previous(); 
		System.out.println(next1.getText()); 
		} 
		//d.quit(); 
	}
}
