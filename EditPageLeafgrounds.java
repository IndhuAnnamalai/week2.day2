package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPageLeafgrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("indhu.02@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Indhu");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		String attribute = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println("The default text entered is: " +attribute );
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean enabled = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]/div/div/input")).isEnabled();
		System.out.println("The field is enabled: " + enabled);
	}

}
