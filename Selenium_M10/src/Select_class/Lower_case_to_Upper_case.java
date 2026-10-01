package Select_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lower_case_to_Upper_case {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement tex = driver.findElement(By.id("username"));
		tex.sendKeys("akash");
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		a.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		a.keyDown(Keys.SHIFT).sendKeys("akash").keyUp(Keys.SHIFT).perform();
		
	}

}
