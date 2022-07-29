package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImagesLoadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Visit the website manually, from scratch
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Heroku the internet" + Keys.ENTER);
		driver.findElement(By.className("iUh30")).click();
		
		
	}

}
