package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ImagesLoadTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Visit the website manually, from scratch
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Heroku the internet" + Keys.ENTER);
		driver.findElement(By.className("iUh30")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]")).click();
		String actualString = driver.findElement(By.tagName("h3")).getText();
		
		String expectedString = "Broken Images";
		Assert.assertEquals(actualString, expectedString, "titles do not match");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
