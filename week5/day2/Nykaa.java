package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='brands']"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(mousehover).perform();
		
		driver.findElement(By.xpath("//input[@id='brendSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris")) {
			System.out.println(title);
		}
		
		WebElement sort = driver.findElement(By.xpath("//span[@class='sort-name']"));
		driver.executeScript("arguments[0].click();", sort);
		
		WebElement click = driver.findElement(By.xpath("//span[text()='customer top rated']"));
		driver.executeScript("arguments[0].click();", click);
		
		WebElement click1 = driver.findElement(By.xpath("(//div[@class='filter-open css-1kwl9pj'])[1]"));
		driver.executeScript("arguments[0].click();", click1);
		
		Thread.sleep(2000);
		WebElement click2 = driver.findElement(By.xpath("//span[text()='Hair']"));
		driver.executeScript("arguments[0].click();", click2);
		
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>lst = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		
		driver.findElement(By.xpath("(//span[contains(@class,'css-ieawrs')])[3]")).click();
		
		String price = driver.findElement(By.xpath("(//span[@class='css-1 jczs19'])")).getText();
		System.out.println("MRP of the product is "+price);
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])")).click();
		
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		String GrandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']")).getText();
		System.out.println("GrandTotal is "+GrandTotal);
		
		WebElement click3 = driver.findElement(By.xpath("//span[text()='Proceed']"));
		driver.executeScript("arguments[0].click();", click3);
		
		WebElement click4 = driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
		driver.executeScript("arguments[0].click();", click4);
		
		String text1 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		
		if(GrandTotal==text1) {
			System.out.println("Totla is Same");
		}
		else {
			System.out.println("Total is Different");
		}
		
		driver.quit();
	}

}
