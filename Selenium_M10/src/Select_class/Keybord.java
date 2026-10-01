package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keybord {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
		WebElement tex = driver.findElement(By.id("username"));
		tex.sendKeys("akash");
		
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(1000);
		a.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		tex.sendKeys("Akash saw");
		
	}

}
