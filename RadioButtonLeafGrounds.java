package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		boolean value =driver.findElement(By.xpath("//input[@value='1']")).isEnabled();
		if(value==true)
			System.out.println("Checked Is Enabled");
		else
			System.out.println("Unchecked Is Enabled");
	}

}
