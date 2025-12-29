package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserCategory {
	    
	    WebDriver driver;
	    WebDriverWait wait;
	    
	    public UserCategory(WebDriver driver) {
	        this.driver=driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	    
	    public void category() {
	        WebElement vwcat=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Categories']")));
	        vwcat.click();
	    }
	    public void selectCat() {
	        WebElement selctcat=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='drop' and text()='DEMO']")));
	        selctcat.click();
	    }
}
