package meeshologin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MeeshoLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Login Page
		driver.get("https://www.poorvika.com/orders?srsltid=AfmBOopKvi6OKHWyETr02fx38e-ahlv5B3IYsNoUT8QcYCDLEvwL6AhF");
		driver.findElement(By.id("userData")).sendKeys("9025661542");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='text-black']")).sendKeys("OnePlus Nord CE 4 Lite 5G");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[normalize-space()='OnePlus Nord CE 4 Lite 5G ( Mega Blue, 8GB-256GB )']")).click();
	

		driver.findElement(By.cssSelector(".product-buy-option_add_to_cart_new__KMQWd")).click();
		
		
	

	}

}
