package org.pojo;

import org.Base.Baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locatorclass extends Baseclass {
	
public void loginpage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id='nav-link-accountList']")
private WebElement hellobutton;
@FindBy(xpath="(//span[text()='Sign in'])[1]")
private WebElement signin;
@FindBy(xpath="//*[@type='email']")
private WebElement email;
@FindBy(xpath="(//*[@id='continue'])[1]")
private WebElement login;



public WebElement getHellobutton() {
	return hellobutton;
}
public WebElement getSignin() {
	return signin;
}
public WebElement getEmail() {
	return email;
}
public WebElement getLogin() {
	return login;
}








}
