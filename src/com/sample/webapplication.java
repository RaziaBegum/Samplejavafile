package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webapplication {

	WebDriver driver;
	public void invokeBrowser()
	{
	System.setProperty("webDriver.Chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://www.edureka.co/blog/selenium-tutorial");
	driver.getTitle();
	System.out.println("Title:");
	
	}
	
	public static void main(String[] args)
	{
	
	}
}