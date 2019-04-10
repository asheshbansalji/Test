package test;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  System.setProperties("webdriver.chrome.driver","C:\\Ashesh\\webdrivers\\chromedriver_win32\chromedriver");
	Webdriver driver=new ChromeDriver();
  }
}
