package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserAdminMsgs {
WebDriver driver;
WebDriverWait wait;

public UserAdminMsgs(WebDriver driver) {
	this.driver=driver;
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}


public void UserAdminMsgs() {
	WebElement admsg=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Admin messages']")));
	admsg.click();
	}

public boolean isadminDisplayed() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	return ((WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//h2[contains(text(),'Admin')]")))).isDisplayed();
}
}