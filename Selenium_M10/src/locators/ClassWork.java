package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("gender-male")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Akash kumar");
		//Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("saw");
		//Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("Akash@123");
		//Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("123456");
		//Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		//Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		//driver.quit();

	}

}
