package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter1_method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement butt = driver.findElement(By.xpath("//button[text()='हिंदी']"));
		System.out.println(butt.getSize());
		Dimension size = butt.getSize();
		System.out.println("Hight = "+size.getHeight());
		System.out.println("Width = "+size.getWidth());
		
		System.out.println(butt.getLocation());
		Point loc = butt.getLocation();
		System.out.println("x axis = "+ loc.getX());
		System.out.println("y axis = "+ loc.getY());
		
		System.out.println(butt.getRect());
		Rectangle rec = butt.getRect();
		System.out.println("x axis = "+rec.getX());
		System.out.println("y axis = "+rec.getY());
		System.out.println("Hight = "+rec.getHeight());
		System.out.println("Width = "+rec.getWidth());
		driver.quit();

	}

}
