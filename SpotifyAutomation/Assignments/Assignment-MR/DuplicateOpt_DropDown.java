package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOpt_DropDown {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("file:///D:/Doc/SDET/JAVA/Hotels.html");
		WebElement food=d.findElement(By.id("mtr"));
		Select s=new Select(food);
		List<WebElement> allopt=s.getOptions();
		
		 Set<String> opt = new HashSet<>();
	     ArrayList<String> dupopt = new ArrayList<>();

	        for (WebElement nele : allopt) {
	            String txt = nele.getText();
	            if (!opt.add(txt)) {
	                dupopt.add(txt);
	            }
	        }

	        for (String duplicate : dupopt) {
	            System.out.println(duplicate);
	        }

	        d.quit();

	}

}
