package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("songs");
		driver.findElement(By.cssSelector( "button[title='Search']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='text-wrapper style-scope ytd-video-renderer']")).click();
	}
}
