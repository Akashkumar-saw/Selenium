package basicScript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class self {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		Dimension d= driver.manage().window().getSize();
		System.out.println(d);
		
		Dimension a = new Dimension(500, 300);
		driver.manage().window().setSize(a);
		Thread.sleep(1000);
		
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		Point q = new Point(200, 60);
		driver.manage().window().setPosition(q);
		driver.quit();
	}

}
