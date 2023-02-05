package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/wait.xhtml");
		
		//wait for visibility
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		visible.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(visible));
		
		//wait for invisibility
		WebElement invisible = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		invisible.click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.invisibilityOf(invisible));
		
		//wait for clickability
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		//wait for text change
		WebElement textchange = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		textchange.click();
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.visibilityOf(textchange));
		String text = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).getText();
		if(text.contains("Did you notice")) {
			System.out.println(text);
		}
		
	}

}
