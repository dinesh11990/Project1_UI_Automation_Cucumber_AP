package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(linkText = "Directory")
	public static WebElement DIRECTORY;

}
