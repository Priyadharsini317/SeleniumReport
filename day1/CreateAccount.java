package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//p[@id='accountname']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//p[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//p[@id='groupNameLocal']")).sendKeys("Priya");
		driver.findElement(By.xpath("//p[@id='officeSiteName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//p[@id='annualRevenue']")).sendKeys("7L");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select drop = new Select(industry);
		drop.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select drop1 = new Select(ownership);
		drop1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select drop2 = new Select(source);
		drop2.selectByValue("LEAD_EXISTCUST");
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select drop3 = new Select(campaign);
		drop3.selectByIndex(5);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4 = new Select(state);
		drop4.selectByValue("TX");
		driver.findElement(By.xpath("//p[@class='smallSummit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}

}
