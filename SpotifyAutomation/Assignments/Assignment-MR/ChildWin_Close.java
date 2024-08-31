package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWin_Close {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://secure.indeed.com");
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		String pwin=d.getWindowHandle();
		Set<String> allwin=d.getWindowHandles();
//		for (String win : allwin) {
//			d.switchTo().window(win);
//			if(pwin.equals(win)) {
//				d.close();
//			}
//		}
		Iterator<String> i=allwin.iterator();
		while(i.hasNext()) {
			String win=i.next();
			d.switchTo().window(win);
			if(pwin.equals(win)) {
				d.close();
			}
		}
	}
}