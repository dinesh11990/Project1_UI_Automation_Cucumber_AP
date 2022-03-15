package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.krish.utilities.CommonUtils;
import com.krish.webdriver_manager.DriverManager;

public class LoginPage {


	//Here we are going to implement Singleton Design Pattern

	//Step:1
	private static LoginPage loginInstance;

	//Step:2
	//You cannot explicitly create object
	private LoginPage() {

	}

	//Step:3
	//It has to be static in order call the getInstance() explicitly 

	public static LoginPage getInstance() {

		if(loginInstance==null) {

			loginInstance=new LoginPage();
		}

		return loginInstance;
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------

	@FindBy(id="txtUsername")
	private WebElement USERNAME;
	@FindBy(id="txtPassword")
	private WebElement PASSWORD;
	@FindBy(id="btnLogin")
	private WebElement LOGIN_BUTTON;


	/* we need getters in order to get the methods outside the class

	public WebElement getUSERNAME() {
		return USERNAME;
	}
	public WebElement getPASSWORD() {
		return PASSWORD;
	}
	public WebElement getLOGIN_BUTTON() {
		return LOGIN_BUTTON;
	}*/

	//Writing actions in the page class

	public void enterUserName(String userName) {

try {

	CommonUtils.getInstance().highlightElement(USERNAME);
			USERNAME.sendKeys(userName);
	}catch (Exception e) {

	}}
	
	public void enterPassword(String password) {
		CommonUtils.getInstance().highlightElement(PASSWORD);
		PASSWORD.sendKeys(password);

	}
	public void clickLoginButton() {
		CommonUtils.getInstance().highlightElement(LOGIN_BUTTON);
		LOGIN_BUTTON.click();

	}



}
