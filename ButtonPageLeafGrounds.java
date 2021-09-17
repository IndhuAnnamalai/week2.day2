package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPageLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("home")).click();
		 Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("The position of button is: "+location);
		WebElement findElement = driver.findElement(By.id("color"));
		String cssValue = findElement.getCssValue("background-color");
		System.out.println("The color of the text is: "+cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("The size of the element is: "+size);
		
		
		
	}

}
