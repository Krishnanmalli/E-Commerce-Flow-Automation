package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountRegistration {

	public static void main(String[] args) throws InterruptedException{
		
        WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
		driver.get("https://awesomeqa.com/ui/");
		Thread.sleep(500);
		driver.findElement(By.className("caret")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")).click();
		Thread.sleep(500);
		driver.findElement(By.id("input-firstname")).sendKeys("Michael");
		driver.findElement(By.id("input-lastname")).sendKeys("carter");
		driver.findElement(By.id("input-email")).sendKeys("michael777@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("+1 (555) 123-4567");
		driver.findElement(By.id("input-password")).sendKeys("Password");
		driver.findElement(By.id("input-confirm")).sendKeys("Password");
		Thread.sleep(500);
		driver.findElement(By.name("newsletter")).click();
		Thread.sleep(500);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#content > div > div > a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	    driver.quit();
	}
}
