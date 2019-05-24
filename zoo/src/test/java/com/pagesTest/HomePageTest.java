package com.pagesTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;

import TestBase.TestBase;

public class HomePageTest extends TestBase {

	HomePage hpage;
	@BeforeMethod
	 public void startNow() {
		 launchBrowser();
		 
	 }
	
	@Test()
	public void xyz()
	{
		hpage= new HomePage();
		hpage.signI();
	}

	 
}
