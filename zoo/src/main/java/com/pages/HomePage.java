package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='liOffcanvas']")
	WebElement signIn;

	

	
	public void signI() {
		signIn.click();
		List<WebElement> listOfElements = driver.findElements(By.xpath("//span"));
System.out.println(listOfElements);
	
		
	}
}