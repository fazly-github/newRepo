package lunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {

	public static void main (String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Ahmad Omar Fazly");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div[1]/a[1]/div/span")).click();
		
	//	driver.close();

	}
}


/*
 * Web Link: http://techfios.com/billing/?ng=admin/
 * User Name: demo@techfios.com
 * Password: abc123
 */