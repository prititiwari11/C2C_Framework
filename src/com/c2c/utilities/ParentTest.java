package com.c2c.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentTest 
{
public WebDriver driver;
static Properties configProp = null;

static{
	if(configProp ==null){
		try{
			configProp = new Properties();
			configProp.load(new FileInputStream(new File("Configuration\\Config.properties")));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
		
}

public void SetUp ()
{
	String  browserType= configProp.getProperty("browser");
	switch (browserType) {
	case "CHROME":
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		driver= new ChromeDriver();
		break;
	case "FF":
		driver= new FirefoxDriver();
		break;
	default:
		System.out.println("Error: Browser is incorrect or not specified in config file");
	
	}
	 driver.manage().window().maximize();
	 driver.get("http://dev.concept2alize.com/idp/");
}
}
