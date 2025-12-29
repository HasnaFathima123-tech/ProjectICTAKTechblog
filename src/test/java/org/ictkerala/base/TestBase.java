package org.ictkerala.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
protected WebDriver driver;
public WebDriver getDriver() {
      return driver;
    }
@BeforeClass
public void seup() {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://64.227.132.106/#");
}
@AfterClass
public void tearDown() {
	driver.quit();
}
}
