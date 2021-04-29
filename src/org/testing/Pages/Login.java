package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver= driver;
		this.pr= pr;
	}
	public void Signin(String username, String password) throws InterruptedException
	{
		List<WebElement> signin= driver.findElements(By.xpath(pr.getProperty("signin")));
		signin.get(15).click();;
		WebElement user= driver.findElement(By.id("identifierId"));
		user.sendKeys(username);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(6000);
		WebElement pass= driver.findElement(By.xpath(pr.getProperty("password")));
		pass.sendKeys(password);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();;
		Thread.sleep(4000);
	}
	
}
