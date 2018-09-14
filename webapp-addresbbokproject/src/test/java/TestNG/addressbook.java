package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class addressbook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                 ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);
		//  driver = new ChromeDriver();
		  driver.get("http://ec2-13-127-168-243.ap-south-1.compute.amazonaws.com:8080/");
		  //driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

  @Test
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("abc");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("987654321");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("06/06/2018");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	 	  	  
  }
  @Test
  public void addressbook1() {
	  
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("xyz");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("987654321");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("06/06/2018");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	 	  	  
  }
 
   @AfterMethod
    public void logout() {
	    driver.close();
   }
}
