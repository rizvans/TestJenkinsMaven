package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	ChromeDriver driver;
	Properties pr;
	public Logout(ChromeDriver driver, Properties pr)
	{
		this.driver= driver;
		this.pr=pr;
	}

	public void signout() throws InterruptedException
	{
		driver.findElements(By.xpath(pr.getProperty("signoutimage"))).get(0).click();
		Thread.sleep(4000);
		driver.findElements(By.xpath(pr.getProperty("signout"))).get(4).click();
		Thread.sleep(4000);
	}
	
	
}
