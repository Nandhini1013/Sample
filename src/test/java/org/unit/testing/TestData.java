package org.unit.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class TestData extends BaseClassNew{
	public static void main(String[] args) {
		WebDriver d = launchBrowser();
		launchUrl("https://www.facebook.com/");
		maxBrowser();
		pageTitle();
		pageUrl();
		WebElement user=d.findElement(By.id("email"));
		fill(user,"Selenium");
		WebElement pwd=d.findElement(By.id("pass"));
		fill(pwd,"java");
		WebElement btn=d.findElement(By.id("u_0_b"));
		btnClick(btn);
		
	}
 
	
}
