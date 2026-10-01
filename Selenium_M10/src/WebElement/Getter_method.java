package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getter_method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[.='✕']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("glow-ingress-line2")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h4[.='Choose your location']"));
		System.out.println(ele.getText());
		
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//strong[.='Newsletter']"));
		System.out.println(btn.getText());
		
		
		// SCRIPT USING getAttribute, getTageName and getCssValue******
		/*
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement textf = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(textf.getAttribute("placeholder"));
		System.out.println(textf.getTagName());
		Thread.sleep(2000);
		System.out.println(textf.getCssValue("position"));
		
		*/
		Thread.sleep(2000);
		driver.quit();

	}

}
