package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenshotOfPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.converse.in/?srsltid=AU7gw4Xh6q8vIxreCXnm_SOn47NU2fxu22TNB8fZLjR5p6a6LOHBydng");
		
		//Down casting
		TakesScreenshot tks =(TakesScreenshot)driver;
		//Take screenshot
		File temp = tks.getScreenshotAs(OutputType.FILE);
		//permanent file
		File perm = new File("./screenshot/ss.png");
		//copy temp to perm
		FileHandler.copy(temp, perm);
		System.out.println("==SS done==");
		driver.quit();
	}
}
