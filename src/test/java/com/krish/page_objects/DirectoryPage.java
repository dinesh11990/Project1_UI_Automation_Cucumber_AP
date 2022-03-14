package com.krish.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	
	private static DirectoryPage directoryPage;
	
	private DirectoryPage() {
		
	}
	
	public static DirectoryPage getInstance() {
		
		if(directoryPage==null) {
			
			directoryPage= new DirectoryPage();
		}
		return directoryPage;
		
		
	}
	
	
	
	
	@FindBy(id="searchDirectory_job_title")
	public WebElement JOB_TITLE;
	
	@FindBy(id="searchBtn")
	public WebElement SEARCH;
	
	//@FindBy(xpath="select[id='searchDirectory_job_title']")      //b[contains(text(),'John Smith')]
	@FindBy(xpath="//b[contains(text(),'John Smith')]")  
	public WebElement NAME;

	
	
	/*
	public WebElement getJOB_TITLE() {
		return JOB_TITLE;
	}

	public WebElement getSEARCH() {
		return SEARCH;
	}

	public WebElement getNAME() {
		return NAME;
	}*/
	
	public void selectJobTitle(String jobTitle) {
		
		Select select = new Select(JOB_TITLE);
		select.selectByVisibleText("Chief Executive Officer");
	}
	
	public void clickSearch() {
		
		SEARCH.click();
	}
	
	public String getPersonName() {
		
		return NAME.getText();
	}
	

}
