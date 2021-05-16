package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.*;

public class TC1 extends Base
{

@Test
public void login() throws InterruptedException, IOException 
{
	Login login =new Login(driver, pr);
	login.Signin("rizsk89@gmail.com", "Testing@1234");

	

	/*WebElement email= driver.findElement(By.id("identifierId"));
	email.sendKeys("rizsk89@gmail.com");
	WebElement button=driver.findElement(By.className("VfPpkd-RLmnJb"));
	button.click();
	Thread.sleep(6000);
	WebElement password= driver.findElement(By.xpath(pr.getProperty("password")));
	password.sendKeys("Testing@1234");
	WebElement button1= driver.findElement(By.className("VfPpkd-RLmnJb"));
	button1.click();
	Thread.sleep(4000);*/
	
	List<WebElement>explorer=driver.findElements(By.xpath(pr.getProperty("explorer")));
	explorer.get(1).click();
	Thread.sleep(4000);
	List<WebElement>Trending=driver.findElements(By.xpath(pr.getProperty("Trending")));
	Trending.get(0).click();

	ScreenshotCapture.takeScreenShot(driver, "./Screenshot/TC1.png");
	Thread.sleep(3000);
	Logout logout = new Logout(driver,pr);
	logout.signout();
	
	LogsCapture.takelogs("TC1", "Pass login case");
	
	/*List<WebElement>signoutimage=driver.findElements(By.xpath(pr.getProperty("signoutimage")));
	signoutimage.get(0).click();
	Thread.sleep(4000);
	List<WebElement>signout=driver.findElements(By.xpath(pr.getProperty("signout")));
	signout.get(4).click();
	Thread.sleep(4000);*/
}

}