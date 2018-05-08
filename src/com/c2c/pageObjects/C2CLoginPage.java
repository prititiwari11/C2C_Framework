package com.c2c.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.c2c.utilities.ParentPage;

public class C2CLoginPage extends ParentPage
{
   WebDriver driver;
   @FindBy(id="username") WebElement userNameTextbox;
   @FindBy(id="password") WebElement passwordTextbox;
   @FindBy(id="submit") WebElement loginButton;
   
   public C2CLoginPage(WebDriver driver) 
   {
	this.driver= driver;
	PageFactory.initElements(this.driver, this);
   }
   public void setUserName(String userName) 
   {
    enterText(userNameTextbox, userName);
   }
   
   public void setPassword(String passWord) 
   {
	enterText(passwordTextbox, passWord);
   }
   
   public void clickOnLogin()
   {
	clickOnLogin();
   }
   
}
