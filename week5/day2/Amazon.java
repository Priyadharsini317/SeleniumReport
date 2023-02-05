package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("Price: "+price);
		
		//String rating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
		//System.out.println("Rating: "+rating);
		
		WebElement mousehover = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mousehover).perform();
		
		Thread.sleep(3000);
		String rating1 = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
		System.out.println("Rating: "+rating1);
		
		String fivestar = driver.findElement(By.xpath("(//div[@class='a-meter'])[1]")).getText();
		System.out.println("% of 5 star rating: "+fivestar);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		Set<String>windowHandles = driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/amazon1.png");
		FileUtils.copyFile(source, dest);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//span[text()='Cart']"));
		driver.executeScript("arguments[0].click();", click);
		
		String price1 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium')])[3]")).getText();
		System.out.println("Cart Grand Total: "+price1);
		
		if(price==price1) {
			System.out.println("Both price are same");
		}
		else {
			System.out.println("Both Price are diffewrent");
		}
	}

}
