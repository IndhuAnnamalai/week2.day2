package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("Indhumathi");
		driver.findElement(By.name("UserLastName")).sendKeys("Annamalai");
		driver.findElement(By.name("UserEmail")).sendKeys("indhu.02@gmail.com");
		//driver.findElement(By.name("UserTitle")).
		WebElement dropDown = driver.findElement(By.name("UserTitle"));
		Select drop1= new Select(dropDown);
		drop1.selectByValue("IT_Manager_AP");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		WebElement dropdown1 = driver.findElement(By.name("CompanyEmployees"));
		Select drop2= new Select(dropdown1);
		drop2.selectByIndex(2);
		
		driver.findElement(By.name("UserPhone")).sendKeys("9940134454");
		
		WebElement dropdown2=driver.findElement(By.name("CompanyCountry"));
		Select drop3= new Select(dropdown2);
		drop3.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		driver.close();
		
		
		
		
	}

}
