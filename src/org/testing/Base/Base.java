package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;

	@BeforeMethod
	public void BrowserOpening() throws InterruptedException, IOException
	{
	File f= new File("../YTFramework2/Object.properties");
	FileInputStream fi= new FileInputStream(f);
	pr= new Properties();
	pr.load(fi);
	
	System.setProperty("webdriver.chrome.driver", "../YTFramework2/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	}

	@AfterMethod
	public void browserclose()
	{
		driver.close();
	}
}
