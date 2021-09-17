package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		String attribute = driver.findElement(By.xpath("//div[@id='contentblock']/section")).getAttribute("src");	
	System.out.println("The attribute is: "+attribute);
	driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/img")).click();
	}
	

}
