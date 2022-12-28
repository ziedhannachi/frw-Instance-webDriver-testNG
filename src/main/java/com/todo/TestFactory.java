package com.todo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestFactory extends TestRunnerDriver  {
	
	public void login(WebDriver driver) {		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).getText().contains("Welcome"));
		driver.close();
	}

}
