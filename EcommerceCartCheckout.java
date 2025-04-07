package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceCartCheckout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();	
		driver.get("https://awesomeqa.com/ui/");
		driver.findElement(By.className("caret")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("michael1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")).click();
		Thread.sleep(500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.className("button-group")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"input-option225\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input-option225\"]")).sendKeys("2025-05-03");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.id("cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button-payment-address")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#button-shipping-address")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button-shipping-method")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea"))).sendKeys("Leave the package at the front door");
		jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(1500);
		jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("button-confirm")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("caret")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
        driver.quit();
	}
}