package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("priya");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='12523']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("view lead")) {
			System.out.println("Title is verified.");
		}
		else {
			System.out.println("Is not verified.");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Leaf Test");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		driver.close();
	}

}
