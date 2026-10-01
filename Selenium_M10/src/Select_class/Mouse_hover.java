package Select_class;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
		Thread.sleep(8000);
//		driver.findElement(By.xpath("//main[@data-aos='zoom-in']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Ratings")).click();
//		Thread.sleep(1000);
		
//		WebElement star = driver.findElement(By.xpath("(//label)[5]"));
//		Actions a = new Actions(driver);
//		a.moveToElement(star).perform();
		

//		List<WebElement> stars = driver.findElements(By.xpath("(//label)[5]"));
		Actions a = new Actions(driver);
		
		/*for (WebElement star : stars) {
	    a.moveToElement(star).perform();
             Thread.sleep(2000);
	}*/
		for(int i=1;i<=5;i++) {
			WebElement star=driver.findElement(By.xpath("(//label)["+i+"]"));
			a.moveToElement(star).perform();
			Thread.sleep(2000);
		}
		
		/*for (int i = 0; i < stars.size(); i++) {
			WebElement s = stars.get(i);
			a.moveToElement(s).perform();
			Thread.sleep(3000);
			
		}*/
	}

}
