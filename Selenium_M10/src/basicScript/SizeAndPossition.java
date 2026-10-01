package basicScript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndPossition {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Point position =driver.manage().window().getPosition();
		System.out.println(position);

	}

}
