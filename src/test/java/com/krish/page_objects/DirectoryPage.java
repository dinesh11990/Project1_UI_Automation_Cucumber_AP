package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	
	@FindBy(id="searchDirectory_job_title")
	public static WebElement JOB_TITLE;
	
	@FindBy(id="searchBtn")
	public static WebElement SEARCH;
	
	//@FindBy(xpath="select[id='searchDirectory_job_title']")      //b[contains(text(),'John Smith')]
	@FindBy(xpath="//b[contains(text(),'John Smith')]")  
	public static WebElement NAME;

}
