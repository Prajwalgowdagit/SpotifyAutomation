package assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search_Opt_DropDown_Set {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter food name:");
		String search=sc.nextLine();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.get("file:///D:/Doc/SDET/JAVA/Hotels.html");
		WebElement food=d.findElement(By.id("mtr"));
		Select s=new Select(food);
		List<WebElement> allopt=s.getOptions();
		
		Set<String> optionsText = new HashSet<>();
        for (WebElement nele : allopt) {
            optionsText.add(nele.getText());
        }
        
        if (optionsText.contains(search)) {
            System.out.println(search + " is present in the options");
        } else {
            System.out.println(search + " is not present in the options");
        }
        
        d.quit();

	}

}
