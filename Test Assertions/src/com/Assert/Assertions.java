package com.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	SoftAssert soft = new SoftAssert();
	WebDriver driver;
	@Test
	public void Launch() {
		System.setProperty("webdriver.chrome.driver", "/home/madhuriadapalag/Downloads/chromedriver");
		driver = new ChromeDriver();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "Launch" })
	public void Facebook() {
		driver.get("https://www.facebook.com");
		Assert.assertEquals("log in or sign up", driver.getTitle());	
		/*soft.assertEquals("log in or sign up", driver.getTitle());*/	
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods = { "Facebook" })
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("avi10thstudent@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
		soft.assertAll();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
