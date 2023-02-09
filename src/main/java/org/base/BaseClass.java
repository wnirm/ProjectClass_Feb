package org.base;






import java.util.concurrent.TimeUnit;







import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;

//// browser lauch
//public static WebDriver launchBrowser() {
//	WebDriverManager.chromedriver().setup();
//	driver =new ChromeDriver();
//	return driver;
//
//}	

public static WebDriver launchBrowser(String browserName) {
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}

	else if (browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
	}
	
	else {
		System.err.println("invalid Browser");
	}
	return driver;
	
	
}



//URL
public static void launchUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}

//wait
public static void implicitWait(long time) {
driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}

//gettitle
public static String getTitle() {
//	String title = driver.getTitle();
//	return title;
return driver.getTitle();
	
}

// getcurrent url
public static String getCurrentUrl() {
	return driver.getCurrentUrl();

}

//quit
public static void quit() {
	driver.quit();

}

//gettext-- its an webelement method

public static String getText(WebElement a) {
	String text = a.getText();
return text;

}


// getAttribute

public static String getAttribute(WebElement a) {
	String attribute = a.getAttribute("value");
return attribute;

}

// click
public static void click(WebElement a) {
	a.click();

}

// sendkeys
public static void sendKeys(WebElement a,String name) {
	 a.sendKeys(name);

}

//actions
//movetoElement

public static void moveToElement(WebElement a) {
	Actions ac = new Actions(driver);
	ac.moveToElement(a).perform();
	}

//drag and drop

public static void dragAndDrop(WebElement a1,WebElement a2) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(a1, a2).perform();
}

//selectbyindex

public static void selectByindex(WebElement a,int index) {
Select s = new Select(a);
s.selectByIndex(index);
}

//findelement

public static WebElement findElement(String locatorName,String locatorValue) {
	WebElement value=null;
	
	if(locatorName.equals("id")){
	 value = driver.findElement(By.id(locatorValue));
	}
	else if(locatorName.equals("name")) {
		 value = driver.findElement(By.name(locatorValue));
	}
	else if (locatorName.equals("xpath")) {
		 value = driver.findElement(By.xpath(locatorValue));
	}
	return value;
	
}	








































}























	



