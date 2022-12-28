package com.todo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestRunnerDriver  {
    WebDriver driver;
	Singleton base;
	
	@Test(threadPoolSize = 4, invocationCount = 4)
	public void test1() throws IOException {
		base = Singleton.getInstance();
		TestFactory test= new TestFactory();
		driver = base.driver;
		test.login(driver);
	}

}