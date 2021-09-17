package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownLeafGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown = driver.findElement(By.id("dropdown1"));
		Select drop1= new Select(dropDown);
		drop1.selectByIndex(2);
		
		
		
		WebElement dropDown1 = driver.findElement(By.name("dropdown2"));
		Select drop2= new Select(dropDown1);
		drop2.selectByVisibleText("UFT/QTP");
		
		WebElement dropDown2 = driver.findElement(By.id("dropdown3"));
		Select drop3= new Select(dropDown2);
		drop3.selectByValue("1");
		
		String attribute = driver.findElement(By.xpath("//select[@id='dropdown3']/following::option[2]")).getAttribute("UFT/QTP");
		System.out.println("The number of the option selected is: " + attribute);
		driver.findElement(By.xpath("//select[@class='dropdown']/following::select")).sendKeys("Appium");
		driver.findElement(By.xpath("//select/option[contains(text(),'Select your programs')]/following::option[3]")).click();
	}

}
