package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
