package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'register')]")).click();
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();

		//WebElement text= driver.findElement(By.xpath("//span[contains(text(),'errors ')]"));
		//System.out.println(text.getText());
		//driver.quit();
	}

}
