package basicScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		
		// Nevigate 
		/*driver.get("https://www.amazon.sa/?ref_=icp_country_from_in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.err.println(driver.getPageSource());
		*/
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.sa/?ref_=icp_country_from_in");
		Thread.sleep(1000);
		
		driver.navigate().to("http://zepto.com/?srsltid=AfmBOooP_A9h3wECiEi6g7EnCVASDeUmWxHFhULvpwTAVqB5cU88WKsh");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		URL url =new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		
	}

}
