package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MOBILE {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   
		   
		 
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		   WebElement searchBox=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
	        searchBox.sendKeys("Mi A2");
	        WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
	        searchButton.click();
	        WebElement pricetag=driver.findElement(By.cssSelector(("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(5) > div.s-result-list.s-search-results.sg-row > div:nth-child(1) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-16-of-24.sg-col-12-of-20.sg-col-24-of-32.sg-col.sg-col-28-of-36.sg-col-20-of-28 > div > div:nth-child(2) > div.sg-col-4-of-24.sg-col-4-of-12.sg-col-4-of-36.sg-col-4-of-28.sg-col-4-of-16.sg-col.sg-col-4-of-20.sg-col-4-of-32 > div > div.a-section.a-spacing-none.a-spacing-top-small > div > div > a > span:nth-child(1) > span:nth-child(2) > span.a-price-whole")));
	        pricetag.click();
	        WebElement addtocart=driver.findElement(By.xpath(("")));
	        addtocart.click();
	       
	    	
	        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	        driver.close();
		   }

}

