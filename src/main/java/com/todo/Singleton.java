package com.todo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Singleton {
	
	public  WebDriver driver;
	public static Properties prop;
	private static Singleton instance;
	

	private Singleton() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/com/todo/configs/config.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("pathChrome"));
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	 public static Singleton getInstance() throws IOException {
		return instance = new Singleton();
	}
	
	

}
		

