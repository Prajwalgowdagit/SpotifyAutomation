package assignments;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecificTab {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter partial link");
		String plink=sc.nextLine();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");Thread.sleep(5000);
		d.findElement(By.id("browserButton2")).click();
		Set<String> tabs = d.getWindowHandles();
		for (String t : tabs) {
			d.switchTo().window(t);
			if(plink.equalsIgnoreCase(t)) {
				d.switchTo().window(t);
			}
		}
		d.findElement(By.id("confirm-password")).sendKeys("admin");
	}
}
