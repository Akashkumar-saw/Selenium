package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("chai ki tapri pe song");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@aria-label,'चाय की टपरी पे - ऑफिशियल म्यूजिक वीडियो')]")).click();
		Thread.sleep(1000);
		WebElement dou = driver.findElement(By.xpath("(//video[contains(@class,\"video-stream html5-main-video\")])[1]"));
		Actions a = new Actions(driver);
		a.doubleClick(dou).perform();

	}

}
