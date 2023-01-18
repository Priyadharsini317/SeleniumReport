package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("dharsini");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9437689241");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("prik@673");
		WebElement findElement = driver.findElement(By.name("birthday_day"));
		Select drop = new Select(findElement);
		drop.selectByValue("31");
		WebElement findElement2 = driver.findElement(By.name("birthday_month"));
		Select drop2 = new Select(findElement2);
		drop2.selectByIndex(6);
		WebElement findElement3 = driver.findElement(By.name("birthday_year"));
		Select drop3 = new Select(findElement3);
		drop3.selectByVisibleText("2001");
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		
	}

}
