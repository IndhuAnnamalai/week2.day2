package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("indhu.02@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String text2 = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();

		driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
		String text3 = driver.findElement(By.linkText("Duplicate Lead")).getText();
 System.out.println("The text is: " +text3);
		// String title = driver.getTitle();
		if (text3.equals("Duplicate Lead")) {
			System.out.println("The title is correct");
		} else {
			System.out.println("Incorrect page");
		}

		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("The ID is: " + text);
		System.out.println("The ID in text2 is: " + text2);
		if (text2.equals(text)) {
			System.out.println("The duplicated ID is same as captured ID");
		} else {
			System.out.println("The IDs are different");
		}
	}

}
