package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select drop = new Select(tool);
		drop.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"j_idt87:country_label\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:country_3\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//button[@type='button']/span")).click();
		
		
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();	
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		driver.close();
		
		
	}

}
