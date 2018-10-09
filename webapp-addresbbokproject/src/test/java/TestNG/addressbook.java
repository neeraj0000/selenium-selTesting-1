package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.184.20.118:8080/login?from=%2F/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
  @Test
  public void addressbook() {
	  
	  driver.findElement(By.id("j_username")).sendKeys("neerajbhartiya");
	  driver.findElement(By.name("j_password")).sendKeys("password@123");
	  driver.findElement(By.xpath("//div[@class='submit-button primary']")).click()
	 	  	  
  }
 
   @AfterMethod
    public void logout() {
	    driver.close();
   }
}
