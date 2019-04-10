package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp1")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
