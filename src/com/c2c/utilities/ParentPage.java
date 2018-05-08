package com.c2c.utilities;

import org.openqa.selenium.WebElement;

public class ParentPage 
{
public void enterText(WebElement element, String texts) 
{
	element.sendKeys(texts);
}

public void ClickOnElement(WebElement element) 
{
	element.click();
}
}
