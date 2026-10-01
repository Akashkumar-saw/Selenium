package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement butt = driver.findElement(By.xpath("//button[text()='हिंदी']"));
		System.out.println(butt.isDisplayed());
		System.out.println(butt.isEnabled());
		System.out.println(butt.isSelected());
		
		driver.quit(); 

	}

}
