package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	public static WebElement USERNAME;
	@FindBy(id="txtPassword")
	public static WebElement PASSWORD;
	@FindBy(id="btnLogin")
	public static WebElement LOGIN_BUTTON;
	

}
