package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		String text = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		WebElement text1 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		text1.click();
		System.out.println(text1.getText());
		driver.close();
		
	}

}
