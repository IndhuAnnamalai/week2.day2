package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		boolean enabled=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isEnabled();
		if(enabled==true)
		{
			System.out.println("The check box Selenium is enabled");
		}
		else
			System.out.println("CheckBox Selenium is Not enabled");
		
		boolean enabled1=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isEnabled();
		
		if(enabled1==true) {
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
			
		}
		else {
			System.out.println("Not Selected");
		}
	
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
	}

}
