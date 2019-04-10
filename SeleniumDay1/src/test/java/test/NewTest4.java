package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest4 {
@Test
	public  void testKeys () throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Ashesh\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("FromTag"));
		
		Actions act1=new Actions(driver);
		act1.keyUp(from,Keys.SHIFT).perform();
		act1.sendKeys(from, "h").perform();
		Thread.sleep(3000);
  		act1.sendKeys("y").perform();
		Thread.sleep(3000);
		act1.sendKeys("d").perform();
		Thread.sleep(5000);
		act1.sendKeys(Keys.ENTER).perform();
		
		WebElement to = driver.findElement(By.id("ToTag"));
		/*Actions act2=new Actions(driver);
		act2.sendKeys(to, "b").perform();
		Thread.sleep(3000);
		act2.sendKeys("a").perform();
		Thread.sleep(3000);
		act2.sendKeys("n").perform();
		Thread.sleep(5000);*/
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.id("u1-id-2"), By.className("list")));
		WebElement u1= driver.findElement(By.id("u1-id-2"));
		List<WebElement> list=u1.findElement(By.tagName("li"));
		
		for (WebElement e:list)
		{
			if (e.getText().contains("HDD")
					{
				e.click();
				break;
					}
		}
		
		Assert.
		
		
		//act1.sendKeys(Keys.ENTER).perform();
		
	}

}
