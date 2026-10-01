package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//main[@data-aos='zoom-in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(1000);
	    WebElement circle = driver.findElement(By.id("circle"));
	    Actions a = new Actions(driver);
	    a.clickAndHold(circle).perform();
	    Thread.sleep(1000);
	    a.release(circle).perform();
		
	}

}
