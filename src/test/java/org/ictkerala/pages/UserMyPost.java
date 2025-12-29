package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMyPost {
WebDriver driver;
WebDriverWait wait;

public UserMyPost(WebDriver driver) {
	this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}
public void clickMyPost() {
	WebElement clkpst=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='My posts'])[1]")));
	clkpst.click();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", clkpst);
}
}