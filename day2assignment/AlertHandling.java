package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='simple_result']")).getText());
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		System.out.println(driver.findElement(By.xpath("//span[@id='result']")).getText());
		driver.close();
	}

}
