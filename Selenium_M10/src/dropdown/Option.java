package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Option {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.id("colors"));
		Select s = new Select(d);
		List<WebElement> o = s.getOptions();
		for (WebElement opt : o) {
			System.out.println(opt.getText());
		}
		Thread.sleep(1000);
		s.selectByIndex(5);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("First - "+s.getFirstSelectedOption().getText());
		driver.quit();
	}

}
