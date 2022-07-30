package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ImagesLoadTest {
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Visit google
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		// Search for The internet heroku app, and enter the first result
		driver.findElement(By.name("q")).sendKeys("Heroku the internet" + Keys.ENTER);
		driver.findElement(By.className("iUh30")).click();
		
		// Enter Broken image section
		driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]")).click();
		String actualString = driver.findElement(By.tagName("h3")).getText();
		
		// Check if the title is correct
		String expectedString = "Broken Images";
		Assert.assertEquals(actualString, expectedString, "titles do not match");
		
		// Checking the 3 images
		WebElement image1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/img[1]"));
		Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0", image1);
		String testResult1 = imageLoaded1 ? "Image is loaded" : "Image is not loaded";
		
		WebElement image2 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/img[2]"));
		Boolean imageLoaded2 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0", image2); 
		String testResult2 = imageLoaded2 ? "Image is loaded" : "Image is not loaded";

		WebElement image3 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/img[3]"));
        Boolean imageLoaded3 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0", image3); 
        String testResult3 = !imageLoaded3 ? "Image is not loaded" : "Image is loaded";
        
        Assert.assertTrue(imageLoaded1 == false, testResult1);
        Assert.assertTrue(imageLoaded2 == false, testResult2);
        Assert.assertTrue(imageLoaded3 == true, testResult3);
        Assert.assertEquals(imageLoaded1, false);
        
        System.out.println("Finishing tests!");
		Thread.sleep(5000);
		driver.close();
		
	}
	


}
