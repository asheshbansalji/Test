package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Ashesh\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
		Thread.sleep(2000);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards']"))).perform();
		Thread.sleep(2000);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']"))).click().perform();
		Thread.sleep(2000);
		Assert .assertTrue(driver.getCurrentUrl().contains("credit_cardd"));

  }
}
