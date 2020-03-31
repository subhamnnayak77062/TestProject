package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Subham");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Nayak");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9437177062");
		driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("Subham@195");
		WebElement day , month, year;
		day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select fday ,fmonth, fyear; 
		fday = new Select(day);
		fmonth = new Select(month);
		fyear = new Select(year);
		fday.selectByIndex(1);
		fmonth.selectByValue("12");
		fyear.selectByVisibleText("1990");
		
		
		
		Thread.sleep(5000);
		
 boolean radio =  driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).isEnabled();
		 
		 if(!radio) {
			 
			 System.out.println("Button is not enabled");
			 driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
		 }
		 else {
			 System.out.println("Button is enabled");
			 driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
		 }
		
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
	/*	driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		 
		 boolean radio =  driver.findElement(By.xpath("")).isEnabled();
		 
		 if(radio) {
			 
			 System.out.println("Button is enabled");
			
		 }
		 else {
			 System.out.println("Button is not enabled");
		 }*/
	
	
	Thread.sleep(5000);
	driver.close();
	}

}
