package basicScript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndDrag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//resize.......
		Dimension d =new Dimension(100, 500);
		driver.manage().window().setSize(d);
		//drag.......
		Point p = new Point(10, -70);
		driver.manage().window().setPosition(p);

	}

}
