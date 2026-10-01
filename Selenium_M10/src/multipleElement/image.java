package multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=gh_ht&utm_medium=ht_rev&utm_campaign=gh_ht_listicle2&gad_source=1");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.tagName("img"));
		for (WebElement l : link) {
			System.out.println(l.getAttribute("src"));
		}
		driver.quit();
	}

}
