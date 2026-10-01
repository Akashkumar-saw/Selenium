package multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class hWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		List<WebElement> link = driver.findElements(By.xpath("//img | //a"));
		for (int i = link.size()-1; i>=0; i--) {
			if (i%2 == 0) {
				
				System.out.println(link.get(i).getAttribute("src"));
				System.out.println(link.get(i).getAttribute("href"));
			}
			
			
		}
		driver.quit();

	}

}
