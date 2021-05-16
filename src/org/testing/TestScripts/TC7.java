package org.testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 extends Base
{
	
	
	@Test
	public void login() throws InterruptedException
	{
		Login login =new Login(driver, pr);
		login.Signin("rizsk89@gmail.com", "Testing@1234");
		
		/*List<WebElement> Signin=driver.findElements(By.xpath("//paper-button[@id='button']"));
		Signin.get(1).click();
		WebElement email= driver.findElement(By.id("identifierId"));
		email.sendKeys("rizsk89@gmail.com");
		WebElement button=driver.findElement(By.className("VfPpkd-RLmnJb"));
		button.click();
		Thread.sleep(6000);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Testing@1234");
		WebElement button1= driver.findElement(By.className("VfPpkd-RLmnJb"));
		button1.click();
		Thread.sleep(4000);*/
		
		List<WebElement> videoplay= driver.findElements(By.xpath("//a[@id='video-title-link']"));
		videoplay.get(4).click();
		Thread.sleep(4000);
		List<WebElement> threedot= driver.findElements(By.xpath("//yt-icon[@class='style-scope ytd-button-renderer']"));
		threedot.get(9).click();
		Thread.sleep(3000);
		List<WebElement> watchlater= driver.findElements(By.xpath("//yt-formatted-string[@id='label']"));
		watchlater.get(0).click();
		WebElement crossicon= driver.findElement(By.xpath("//yt-icon[@icon='close']"));
		crossicon.click();;
		
		Logout logout = new Logout(driver,pr);
		logout.signout();
		
		/*List<WebElement>signoutimage=driver.findElements(By.xpath("//img[@id='img']"));
		signoutimage.get(0).click();
		Thread.sleep(4000);
		List<WebElement>signout=driver.findElements(By.xpath("//*[@role='link']"));
		signout.get(4).click();
		Thread.sleep(4000);	*/
	}
	
}


