package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHomePage {
WebDriver driver;
WebDriverWait wait;
public UserHomePage(WebDriver driver) {
	this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}
public void clckHome() {
	WebElement home=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Home'])[1]")));
	home.click();
	
}
}
