package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserNewPost {
	    WebDriver driver;
	    WebDriverWait wait;
	    
	    public UserNewPost(WebDriver driver) {
	    	this.driver=driver;
	        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    }


	    
	    public void newPost() {
	        WebElement nwp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='New post']")));
	        nwp.click();
	    }
	    public void addPost(String Sample, String url ,String posttitle) {
	        WebElement addNew=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='P_title']")));
	        addNew.sendKeys(Sample);
	        
	        WebElement addUrl=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='P_image']")));
	        addUrl.sendKeys(url);
	        
	        Select selCatgry=new Select(driver.findElement(By.xpath("//select[@name='p_cat']")));
	        selCatgry.selectByVisibleText("COMPUTER");
	        
	        WebElement postTtl=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='p_post']")));
	        postTtl.sendKeys(posttitle);
	        
	        WebElement snd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Send for approval']")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", snd);

	        wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();

	    }
		

    }
		
