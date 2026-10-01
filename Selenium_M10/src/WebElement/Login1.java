package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='X Path']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Login 1.0']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username:')]")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("14576");
		driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'radio')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Login 3.0']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("14576");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
