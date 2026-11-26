package com.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpr {
	
	WebDriver driver=new ChromeDriver();
	@BeforeTest 
	public void beforeTest() { 
	driver.manage().window().maximize();
    driver.get("https://www.knowledgeware.in/Automation/practiceform.html");
	}
    
      @Test()
      public void textbox() {
    	  driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("thas");
  		  driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("j");
  		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("thas123@gmail.com");
  		  driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9876543210");
		  driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("04/10/2026");
		  driver.findElement(By.xpath("//*[@id=\"subjects\"]")).sendKeys("testing");
		  driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("peraiyur");    		
    }
	  @Test()
	  public void radiabutton() {
		  driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"music\"]")).click();
		  
	  }
		@Test()
		public void dropdown() {
			WebElement dropdown1 =  driver.findElement(By.xpath("//*[@id=\"countrySelect\"]"));
			Select select = new Select(dropdown1);
			select.selectByVisibleText("NCR");	
			WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"citySelect\"]"));
			Select select1 = new Select(dropdown2);
			select1.selectByVisibleText("Noida");
		}
         @Test()
         public void fileupload() {
        	 driver.findElement(By.xpath("//*[@id=\"picture\"]")).sendKeys("C:\\img1.JPG");
         }
	}


