package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement col = driver.findElement(By.id("colors"));
		Select s = new Select(col);
		System.out.println(s.isMultiple());
		Thread.sleep(2000);
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("green");
		Thread.sleep(2000);
		s.selectByContainsVisibleText("Green");
		Thread.sleep(2000);
		s.selectByIndex(6);
		Thread.sleep(2000);
		s.selectByValue("red");
		Thread.sleep(2000);
		s.deselectAll();
		

	}

}
