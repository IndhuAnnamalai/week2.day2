package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath( "(//input[@name='firstName'])[3]")).sendKeys("Indhumathi");
	    driver.findElement(By.xpath( "//button[text()='Find Leads']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	    
	    		driver.findElement(By.linkText("Edit")).click();
	    		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	    	    System.out.println("The title of the page is: " +text);
	    	    if(text.equals("Edit Lead")){
	    	    	System.out.println("The title is verified");
	    	    	
	    	    }else {
	    	    	System.out.println("The title is incorrect");
	    	    }
	    		driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeafSolutions");
	    		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
	}

}
