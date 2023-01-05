package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	
	public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyadharsini");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnamoorthy");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selnium using Java");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya123@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
	driver.findElement(By.name("submitButton")).click();
	String title1 = driver.getTitle();
	System.out.println(title1);
	driver.close();
	

	}

}
