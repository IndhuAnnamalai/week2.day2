package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Indhumathi");
		driver.findElement(By.name("lastname")).sendKeys("Annamalai");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile')]")).sendKeys("indhu.02@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("indhu.02@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Indhu@1986");
		
		WebElement dropDown = driver.findElement(By.id("day"));
		Select drop1= new Select(dropDown);
		drop1.selectByIndex(1);
		
		WebElement dropDown1 = driver.findElement(By.id("month"));
		Select drop2= new Select(dropDown1);
		drop2.selectByVisibleText("Jun");
		
		WebElement dropDown2 = driver.findElement(By.id("year"));
		Select drop3= new Select(dropDown2);
		drop3.selectByValue("1986");
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
	}

}
