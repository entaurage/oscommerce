package com.common;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OSBase {

    public WebDriver driver;
    
    String browser = "chrome";
    
    public WebDriver getDriver() {
    	
    	if(browser.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabbi\\eclipse-workspace\\OsCommerce_testing\\Driver\\chromedriver.exe");
    		driver = new ChromeDriver();
    		
    	}
    	else if  (browser.equals("firefox"))  {
    		System.setProperty("Webdriver.gecko.driver","C:\\Users\\sabbi\\eclipse-workspace\\OsCommerce_testing\\Driver\\geckodriver.exe" );
    		driver = new FirefoxDriver();
    			
    	}
    	else if (browser.equals("IEdriverServer")) {
    		System.setProperty("webdriver.ie.driver", "C:\\Users\\sabbi\\eclipse-workspace\\OsCommerce_testing\\Driver\\IEDriverServer.exe");
    		driver = new InternetExplorerDriver();
    	}
    	else {
    		System.out.println("Wrong Browser Name");
    	}
    	
    	//driver.get("https:oscommerce.com");
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
    	return driver;
    	
    }

}
