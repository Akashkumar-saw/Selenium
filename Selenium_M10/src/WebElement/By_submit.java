package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_submit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Akash");
		//Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("asdfghj@234.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("123456");
		
	//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Register']")).submit();
		
		//driver.findElement(By.cssSelector("input[@placeholder='Enter your name'])")).sendKeys("hello");
	}

}
