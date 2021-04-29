package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.*;

public class TC2 extends Base
{
	@Test
	public void login() throws InterruptedException
	{
		Login login =new Login(driver, pr);
		login.Signin("rizsk89@gmail.com", "Testing@1234");
		
		/*List<WebElement> signin= driver.findElements(By.xpath(pr.getProperty("signin")));
		signin.get(15).click();
		WebElement email= driver.findElement(By.id("identifierId"));
		email.sendKeys("rizsk89@gmail.com");
		WebElement button=driver.findElement(By.className("VfPpkd-RLmnJb"));
		button.click();
		Thread.sleep(6000);
		WebElement password= driver.findElement(By.xpath(pr.getProperty("password")));
		password.sendKeys("Testing@1234");
		WebElement button1= driver.findElement(By.className("VfPpkd-RLmnJb"));
		button1.click();
		Thread.sleep(4000);*/
		
		List<WebElement>History=driver.findElements(By.xpath(pr.getProperty("History")));
		History.get(4).click();
		Thread.sleep(4000);
		
		Logout logout = new Logout(driver,pr);
		logout.signout();
		
		/*List<WebElement>signoutimage=driver.findElements(By.xpath(pr.getProperty("signoutimage")));
		signoutimage.get(0).click();
		Thread.sleep(4000);
		List<WebElement>signout=driver.findElements(By.xpath(pr.getProperty("signout")));
		signout.get(4).click();
		Thread.sleep(4000);*/
	}
	
}
		
		
		
		