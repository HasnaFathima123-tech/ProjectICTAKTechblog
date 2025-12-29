package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginPage {
WebDriver driver;
public UserLoginPage(WebDriver driver) {
	this.driver=driver;
}
public void dropdown() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement dropDown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navbarDropdown' and contains(@class,'dropdown-toggle')]")));
	dropDown.click();
	WebElement lgin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='drop' and text()='Login']")));
	lgin.click();
}
public void loginPage(String email,String password) {
	driver.findElement(By.id("user")).sendKeys(email);
	driver.findElement(By.id("pwd")).sendKeys(password);
}
public void clickbtn() {
	WebElement btn=driver.findElement(By.id("logbut"));
	btn.click();
}
}
