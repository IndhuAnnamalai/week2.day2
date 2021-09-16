package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Indhumathi");
		driver.findElement(By.id("lastNameField")).sendKeys("Annamalai");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Indhu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Annamalai");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("06/02/1986");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("IndhuProfile");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		
		WebElement dropdown=driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select drop=new Select(dropdown);
		drop.selectByVisibleText("USD - American Dollar");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing page");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("This is a create contact form for testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("indhu.02@gmail.com");
		
		WebElement dropdown1=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drop1=new Select(dropdown1);
		drop1.selectByValue("NY");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_description")).sendKeys("This field is edited as Testing page edited");
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Edited page");
		driver.findElement(By.xpath("//form[@id='updateContactForm']/div/div[2]//table/tbody/tr[8]/td/input")).click();
		
		String title = driver.getTitle();
		System.out.println("The title of the resulting page is: " + title);
	}

}
