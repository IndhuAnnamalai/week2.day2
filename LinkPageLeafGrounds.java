package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkPageLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The link to click is: "+attribute);
		
		//driver.findElement(By.linkText("Go to Home Page")).click();
		String title = driver.findElement(By.xpath("//div[@class='wp-page-heading']/h1")).getText();
		System.out.println("The title is: "+title);
		if(title.equals("Locators and Selenium Interactions")) {
			System.out.println("The link name is equal");
		}else {
			System.out.println("The link names are different");
		}
		
		String attribute2 = driver.findElement(By.linkText("How many links are available in this page?")).getAttribute("href");
		System.out.println("The attribute2 is : " +attribute2 );
		driver.findElement(By.linkText("Verify am I broken?")).click();
	}

}
