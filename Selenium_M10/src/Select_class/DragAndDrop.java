package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(1000);
		WebElement ter = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement ter2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement loc = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(ter, loc).perform();
		a.dragAndDrop(ter2, loc).perform();
		
		
        WebElement ter3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement ter4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement loc2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		a.dragAndDrop(ter3, loc2).perform();
		a.dragAndDrop(ter4, loc2).perform();

	}

}
