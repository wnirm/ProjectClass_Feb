package org.test;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		
		
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		implicitWait(30);
		
		
//		        WebElement txtusername = findElement("id", "email");
//				sendKeys(txtusername, "nirmal");
//		
//				WebElement txtpassword = findElement("id", "pass");
//				sendKeys(txtpassword, "123");
//		
//				WebElement btnclick = findElement("name", "login");
//				click(btnclick);
	
				
		    
			sendKeys(findElement("id", "email"), "nirmal");
	
			sendKeys(findElement("id", "pass"), "123");
	
			click(findElement("name", "login"));
				
				quit();
				
				
				
				
				
				
				
				
				
				
				
	}
	

}
