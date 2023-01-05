package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
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
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop = new Select(source);
		drop.selectByVisibleText("Employee");
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1 = new Select(campaign);
		drop1.selectByValue("9001");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2 = new Select(ownership);
		drop2.selectByIndex(4);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop3 = new Select(country);
		drop3.selectByVisibleText("India");
		driver.findElement(By.linkText("Create Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		}
	
}
