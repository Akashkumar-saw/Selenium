package multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class for_loop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.tagName("img"));
		for (int i =0 ; i < link.size();i++) {
			System.out.println(link.get(i).getAttribute("src"));
		}
		driver.quit();

	}

}
